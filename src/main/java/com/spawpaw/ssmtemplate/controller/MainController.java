package com.spawpaw.ssmtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0
 * @copyright: 2017.4.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * 用于用户相关功能的接口
 */
@Controller
public class MainController {

    @RequestMapping(path = {"", "/", "index", "index/"})
    public String index(HttpSession session) {
        return "index";
    }

}
