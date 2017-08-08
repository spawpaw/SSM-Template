package com.spawpaw.ssm.common.controller;

import com.spawpaw.ssm.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理404等错误页面
 *
 * @author BenBenShang spawpaw@hotmail.com on 17-6-25.
 */
@RestController
@RequestMapping(path = {"/error"})
public class ErrorPageController {

    @RequestMapping(path = {"/{code}"})
    CommonResponse exceptionHandler(@PathVariable int code) {
        return new CommonResponse(code == 0 ? -1 : code, "" + code);
    }
}
