package com.spawpaw.ssm.common.interceptor;

import com.spawpaw.ssm.exception.PermissionDeniedException;
import com.spawpaw.ssm.util.RequiredAuth;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 预处理所有请求
 * 在spring-web.xml中配置
 *
 * @author BenBenShang spawpaw@hotmail.com on 2017/6/26
 */
@Configuration
public class PreInterceptor extends HandlerInterceptorAdapter {
    /**
     * preHandle方法是进行处理器拦截用的，顾名思义，该方法将在Controller处理之前进行调用，SpringMVC中的Interceptor拦截器是链式的，可以同时存在
     * 多个Interceptor，然后SpringMVC会根据声明的前后顺序一个接一个的执行，而且所有的Interceptor中的preHandle方法都会在
     * Controller方法调用之前调用。SpringMVC的这种Interceptor链式结构也是可以进行中断的，这种中断方式是令preHandle的返
     * 回值为false，当preHandle的返回值为false的时候整个请求就结束了。
     */
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        try {
            HandlerMethod hm = (HandlerMethod) handler;//如果没有对应的方法,那么这句会抛出类型转换异常
            RequiredAuth requiredAuth = hm.getMethodAnnotation(RequiredAuth.class);

            if (requiredAuth != null)
                for (String auth : requiredAuth.auths())//检查该用户的session中是否有对应的Attribute
                    if (request.getSession().getAttribute(auth) == null)
                        throw new PermissionDeniedException("权限不足");
        } catch (Exception e) {
            //什么也不做
        }
        return true;
    }
}
