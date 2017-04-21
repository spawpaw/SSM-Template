package com.spawpaw.ssmtemplate.controller;

import com.spawpaw.ssmtemplate.common.dto.CommonResponse;
import com.spawpaw.ssmtemplate.common.dto.StatuesEnum;
import com.spawpaw.ssmtemplate.common.exception.NoSuchUserException;
import com.spawpaw.ssmtemplate.common.exception.WrongPasswordException;
import com.spawpaw.ssmtemplate.entity.User;
import com.spawpaw.ssmtemplate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0
 * @copyright: 2017.4.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * 用于用户相关功能的接口
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用于登陆的接口
     */
    @RequestMapping(path = {"/login", "/login/"})
    public CommonResponse<String> login(@RequestBody User user, HttpSession session) {
        try {
            userService.login(user, session);
        } catch (NoSuchUserException e) {
            return new CommonResponse<String>(StatuesEnum.LOGIN_FAILURE_WRONG_LOGIN_NAME, "登陆失败，不存在该用户", "");
        } catch (WrongPasswordException e) {
            return new CommonResponse<String>(StatuesEnum.LOGIN_FAILURE_WRONG_PASSWORD, "登陆失败，密码错误", "");
        }
        return new CommonResponse<String>(StatuesEnum.SUCCESS, "登陆成功", "");
    }

    /**
     * 用于登出的接口
     */
    @RequestMapping(path = {"/logout", "/logout/"})
    public void logout(HttpSession session) {
        userService.logout(session);
    }
}
