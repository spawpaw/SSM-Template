package com.spawpaw.ssmtemplate.service;

import com.spawpaw.ssmtemplate.common.exception.NoSuchUserException;
import com.spawpaw.ssmtemplate.common.exception.WrongPasswordException;
import com.spawpaw.ssmtemplate.dao.RetrieveDao;
import com.spawpaw.ssmtemplate.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0
 * @copyright: 2017.4.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * 用于用户相关功能的接口
 */
@Service
public class UserServiceImpl implements UserService {


    @Resource
    private RetrieveDao retrieveDao;

    /**
     * 用于登陆的接口
     */
    @Override
    public void login(User request ,HttpSession session) throws NoSuchUserException, WrongPasswordException {
        User user = retrieveDao.getUserByUserName(request.getUser_name());
        if (user == null) throw new NoSuchUserException();
        if (!user.getPassword().equals(request.getPassword())) throw new WrongPasswordException();
        session.setAttribute("user",user);
    }

    /**
     * 用于登出的接口
     */
    @Override
    public void logout(HttpSession session) {
        //销毁当前session
        session.invalidate();
    }
}
