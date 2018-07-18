package com.spawpaw.ssm.controller;

import com.spawpaw.ssm.common.interceptor.RequiredAuth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(path = "login", method = RequestMethod.GET)
    @RequiredAuth(auths = {"ROLE_ADMIN", "TEST_PERMISSION"})
    void login(HttpSession session) {

    }

}
