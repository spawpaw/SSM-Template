package com.spawpaw.ssm.service;

import com.spawpaw.ssm.entity.User;
import com.spawpaw.ssm.util.RequiredAuth;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 用于用户相关功能的接口
 *
 * @author BenBenShang 2017/4/21.
 */
@RestController
@RequestMapping(path = "/user")
public interface UserService {

    /**
     * 用于注册的接口
     */
    @RequestMapping(path = "", method = RequestMethod.POST)
    User register(@RequestBody User request, HttpSession session);


    /**
     * 获取当前用户的个人资料
     */
    @RequiredAuth(auths = {"user"})
    @RequestMapping(path = "", method = RequestMethod.GET)
    User getMyProfile(HttpSession session);

    /**
     * 修改当前用户的个人资料
     *
     * @return 返回修改过后的个人资料
     */
    @RequiredAuth(auths = {"user"})
    @RequestMapping(path = {""}, method = RequestMethod.PUT)
    User updateMyPassword(@RequestBody String password, HttpSession session);

    /**
     * 用于登出的接口
     */
    @RequestMapping(path = "/logout", method = RequestMethod.GET)
    void logout(HttpSession session);

    /**
     * 用于登录的接口
     */
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    User login(@RequestBody User user, HttpSession session);


}
