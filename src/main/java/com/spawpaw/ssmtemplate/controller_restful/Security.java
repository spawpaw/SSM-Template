package com.spawpaw.ssmtemplate.controller_restful;

import com.spawpaw.ssmtemplate.common.dto.CommonResponse;
import com.spawpaw.ssmtemplate.common.dto.CommonResponseWithData;
import com.spawpaw.ssmtemplate.common.dto.StatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author BenBenShang 2017/5/6.
 * @version: 1.0 2017.2.21
 * @copyright: <p> 2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * Description for this class:
 * <p>$desc
 */

@RestController
public class Security {

    @RequestMapping(value = {"/security/salt","/security/salt/"})
    CommonResponseWithData<String> getSalt(HttpSession session) {
        String salt = "";
        salt=  session.getId();
        return new CommonResponseWithData<String>(StatusEnum.SUCCESS, salt);
    }

}
