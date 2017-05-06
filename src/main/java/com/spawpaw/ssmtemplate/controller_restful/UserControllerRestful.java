package com.spawpaw.ssmtemplate.controller_restful;

import com.spawpaw.ssmtemplate.common.dto.CommonResponse;
import com.spawpaw.ssmtemplate.common.dto.CommonResponseWithData;
import com.spawpaw.ssmtemplate.common.dto.StatusEnum;
import com.spawpaw.ssmtemplate.common.exception.NoSuchUserException;
import com.spawpaw.ssmtemplate.common.exception.WrongPasswordException;
import com.spawpaw.ssmtemplate.entity.User;
import com.spawpaw.ssmtemplate.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0 2017.2.21
 * @copyright: 2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * Description for this class:
 * <p>$desc
 */
@RestController
@RequestMapping(path = {"/user"})
public class UserControllerRestful {
    @Resource
    private UserService userService;

    /**
     * 用于登陆的接口
     */
    @RequestMapping(value = {"/login", "/login/"}, method = RequestMethod.POST)
    public CommonResponse login(@RequestBody User user, HttpSession session) {
        try {
            userService.login(user, session);
        } catch (NoSuchUserException e) {
            return new CommonResponse(StatusEnum.LOGIN_FAILURE_WRONG_LOGIN_NAME);
        } catch (WrongPasswordException e) {
            return new CommonResponse(StatusEnum.LOGIN_FAILURE_WRONG_PASSWORD);
        }
        return new CommonResponse(StatusEnum.SUCCESS);
    }

    /**
     * 用于登出的接口
     */
    @RequestMapping(path = {"/logout", "/logout/"})
    public CommonResponse logout(HttpSession session) {
        userService.logout(session);
        return new CommonResponse(StatusEnum.SUCCESS);
    }
}
