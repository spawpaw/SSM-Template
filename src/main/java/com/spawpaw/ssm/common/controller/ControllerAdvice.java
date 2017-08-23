package com.spawpaw.ssm.common.controller;

import com.spawpaw.ssm.common.dto.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 为Controller提供增强功能
 * 1.封装响应体，在每个请求的数据外包裹一个CommonResponse，用来呈现错误代码和错误描述等信息
 * 2.集中的异常处理，根据在spring-web.xml中的配置，为每个异常指定对应的代码，省去手动配置的麻烦
 *
 * @author BenBenShang spawpaw@hotmail.com on 17-6-29.
 */
//只处理该包下的Controller
// TODO: 将你的service所在的包名填在这里
@RestControllerAdvice(basePackages = {"com.spawpaw.ssm.service_impl"})
public class ControllerAdvice implements ResponseBodyAdvice {

    private static String packagePrefix;

    private static Integer unknownExceptionCode;
    private static boolean showErrorStackInMessage;

    private static Map<String, Integer> errorMap = new HashMap<>();

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        //封装响应体 , 检查instance，防止嵌套
        return o instanceof CommonResponse ? o : new CommonResponse<>(o);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler
    @ResponseBody
    CommonResponse exceptionHandler(Exception ex) {
        //通过设置的包名前缀获取异常代码
        Integer code = errorMap.get(ex.getClass().toString().replace(packagePrefix, ""));

        //如果上述操作失败，则尝试通过全名获取异常代码
        if (code == null)
            code = errorMap.get(ex.getClass().toString().replace("class ", ""));

        //打印异常信息
        ex.printStackTrace();

        //拼接异常message
        String message = ex.getClass().getName()
                + ex.getMessage()
                + (code == null ? "没有注册的异常" : "")
                + (code == null && showErrorStackInMessage ? Arrays.toString(ex.getStackTrace()) : "");

        //返回异常信息
        return new CommonResponse(code == null ? unknownExceptionCode : code, message);
    }


    public void setShowErrorStackInMessage(boolean showErrorStackInMessage) {
        ControllerAdvice.showErrorStackInMessage = showErrorStackInMessage;
    }

    public void setUnknownExceptionCode(Integer unknownExceptionCode) {
        ControllerAdvice.unknownExceptionCode = unknownExceptionCode;
    }

    public void setPackagePrefix(String prefix) {
        packagePrefix = "class " + prefix + ".";
    }

    public void setErrorMap(Map<String, Integer> eMap) {
        errorMap = eMap;
    }

}
