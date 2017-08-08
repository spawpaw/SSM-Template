package com.spawpaw.ssm.service_impl;

import com.spawpaw.ssm.dao.UserDAO;
import com.spawpaw.ssm.entity.User;
import com.spawpaw.ssm.exception.NoSuchUserException;
import com.spawpaw.ssm.exception.UserNotLoginException;
import com.spawpaw.ssm.exception.WrongPasswordException;
import com.spawpaw.ssm.service.UserService;
import com.spawpaw.ssm.util.tool;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang spawpaw@hotmail.com on 17-6-25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDAO userDAO;


    @Override
    public User register(@RequestBody User request, HttpSession session) {
        userDAO.createUser(request);
        return tool.getUser(session);
    }


    @Override
    public User getMyProfile(HttpSession session) {
        //判断是否登录
        if (!tool.isLoggedIn(session))
            throw new UserNotLoginException("没有登录");
        return userDAO.getUserByLoginName(tool.getUser(session).getUser_name());
    }


    @Override
    public User updateMyPassword(@RequestBody String password, HttpSession session) {
        if (!tool.isLoggedIn(session))
            throw new UserNotLoginException("没有登录");
        userDAO.updateUser(password);
        return userDAO.getUserByLoginName(tool.getUser(session).getUser_name());
    }

    @Override
    public void logout(HttpSession session) {
        //清空当前会话
        session.invalidate();
    }

    @Override
    public User login(@RequestBody User user, HttpSession session) {
        User userInDatabase = userDAO.getUserByLoginName(user.getUser_name());
        if (userInDatabase == null)
            throw new NoSuchUserException("登录失败，没有找到该用户");
        if (!userInDatabase.getPassword().equals(user.getPassword()))
            throw new WrongPasswordException("登录失败，密码错误");
        //将登录成功的用户的信息 写入session
        session.setAttribute("user", userInDatabase);
        return userInDatabase;
    }
}
