package com.spawpaw.ssm.common.controller;

import com.spawpaw.ssm.exception.ExceptionInfoService;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.annotation.Resource;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
//只处理该包下的Controller
// TODO: 将你的service所在的包名填在这里
@RestControllerAdvice(basePackages = {"com.spawpaw.ssm.service"})
@RestController
@RequestMapping("error")
public class ControllerAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }


    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //如果body是String,直接返回CommonResponse会出现一些问题(类型转换异常)
        if (body instanceof String) {
            System.err.println("警告:该接口正在直接返回一个String,并不建议这么做*******************************************************");
            return body;
        }
        return body instanceof CommonResponse ? body : new CommonResponse<>(body);
    }

    @Resource
    ExceptionInfoService exceptionInfoService;

    @ExceptionHandler
    @ResponseBody
    CommonResponse exceptionHandler(Exception ex) {
        return exceptionInfoService.getCommonResponse(ex);
    }

    @RequestMapping("{code}")
    CommonResponse errHandler(@PathVariable("code") int code) {
        return new CommonResponse(code, "");
    }
}
