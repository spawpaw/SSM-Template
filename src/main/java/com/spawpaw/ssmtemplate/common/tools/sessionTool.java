package com.spawpaw.ssmtemplate.common.tools;

import com.spawpaw.ssmtemplate.entity.User;

import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/4/15.
 * @version: 1.0 2017.2.21
 * @copyright: spawpaw@hotmail.com CC-BY-NC-SA.
 * Description for this class:
 *
 */
public class sessionTool {

    public static User getUser(HttpSession session) {
        return (User) session.getAttribute("user");
    }
}
