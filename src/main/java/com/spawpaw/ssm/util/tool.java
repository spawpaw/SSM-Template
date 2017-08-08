package com.spawpaw.ssm.util;

import com.spawpaw.ssm.entity.User;
import com.spawpaw.ssm.exception.UserNotLoginException;

import javax.servlet.http.HttpSession;

/**
 * 工具类
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/4/15
 */
public class tool {

    /**
     * 获取当前回话已登录的用户
     * 如果未登录，则抛出UserNotLoginException
     *
     * @return 返回user实体类
     */
    public static User getUser(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null)
            throw new UserNotLoginException("用户未登录，请登陆后再试");
        return user;
    }

    public static boolean isLoggedIn(HttpSession session) {
        return session.getAttribute("user") != null;
    }
}
