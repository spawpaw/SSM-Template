package com.spawpaw.ssmtemplate.service;

import com.spawpaw.ssmtemplate.common.exception.NoSuchUserException;
import com.spawpaw.ssmtemplate.common.exception.WrongPasswordException;
import com.spawpaw.ssmtemplate.entity.User;

import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0
 * @copyright: 2017.4.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * 用于用户相关功能的接口
 */
public interface UserService {
    /**
     * 用于登陆的接口
     */
    public void login(User user,HttpSession session) throws NoSuchUserException, WrongPasswordException;

    /**
     * 用于登出的接口
     */
    public void logout(HttpSession session);
}
