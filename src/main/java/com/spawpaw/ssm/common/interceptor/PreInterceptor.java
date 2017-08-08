package com.spawpaw.ssm.common.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 预处理所有请求
 * 在spring-web.xml中配置
 *
 * @author BenBenShang spawpaw@hotmail.com on 2017/6/26
 */
public class PreInterceptor extends HandlerInterceptorAdapter {

    private List<String> allowUrls;

    /**
     * preHandle方法是进行处理器拦截用的，顾名思义，该方法将在Controller处理之前进行调用，SpringMVC中的Interceptor拦截器是链式的，可以同时存在
     * 多个Interceptor，然后SpringMVC会根据声明的前后顺序一个接一个的执行，而且所有的Interceptor中的preHandle方法都会在
     * Controller方法调用之前调用。SpringMVC的这种Interceptor链式结构也是可以进行中断的，这种中断方式是令preHandle的返
     * 回值为false，当preHandle的返回值为false的时候整个请求就结束了。
     */
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
//        String requestUrl = request.getRequestURI();
//
//        for (String url : allowUrls) {
//            if (requestUrl.endsWith(url)) {
//                return true;
//            }
//        }
//
//        User session = (User) WebUtils.getSessionAttribute(request,
//                "user");
//        if (session != null) {
//            return true;
//        } else {
//            throw new SessionTimeoutException("session超时或丢失");
//        }
        return true;
    }

    public List<String> getAllowUrls() {
        return allowUrls;
    }

    public void setAllowUrls(List<String> allowUrls) {
        this.allowUrls = allowUrls;
    }
}