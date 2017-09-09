package com.spawpaw.ssm.service;

import com.spawpaw.ssm.common.interceptor.RequiredAuth;
import com.spawpaw.ssm.exception.PermissionDeniedException;
import com.spawpaw.ssm.util.Auth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
@RestController
@RequestMapping(path = "/user")
public class UserService {

    @RequestMapping(path = "login", method = RequestMethod.GET)
    @RequiredAuth(auths = {Auth.CAN_ACCESS_X_MODULE, Auth.LOGGED_IN})
    void login(HttpSession session) {

        throw new PermissionDeniedException();
    }

}
