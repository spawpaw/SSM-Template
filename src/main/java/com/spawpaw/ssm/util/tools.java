package com.spawpaw.ssm.util;

import com.spawpaw.ssm.exception.PermissionDeniedException;

import javax.servlet.http.HttpSession;

/**
 * session 相关的工具方法
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
public class tools {

    /**
     * 获取当前session中登录的用户,如果不存在,抛出 PermissionDeniedException
     */
    Object getUser(HttpSession session) {
        if (session.getAttribute("user") == null)
            throw new PermissionDeniedException("用户未登录,请登陆后再试");
        else return session.getAttribute("user");
    }

    /**
     * 当前session是否有用户登录,如果有用户登录, 则返回true, 否则返回false
     */
    boolean isLoggedIn(HttpSession session) {
        return session.getAttribute("user") != null;
    }
}
