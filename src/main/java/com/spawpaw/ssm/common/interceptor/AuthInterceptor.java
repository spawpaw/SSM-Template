package com.spawpaw.ssm.common.interceptor;

import com.spawpaw.ssm.exception.PermissionDeniedException;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 权限拦截器
 * 处理所有在Controller中用注解方式定义的权限,并调用权限枚举中的方法验证用户是否满足访问对应接口的权限
 *
 * @author BenBenShang spawpaw@hotmail.com on 2017/6/26
 */
@Configuration
public class AuthInterceptor extends HandlerInterceptorAdapter {
    /**
     * preHandle方法是进行处理器拦截用的，顾名思义，该方法将在Controller处理之前进行调用，SpringMVC中的Interceptor拦截器是链式的，可以同时存在
     * 多个Interceptor，然后SpringMVC会根据声明的前后顺序一个接一个的执行，而且所有的Interceptor中的preHandle方法都会在
     * Controller方法调用之前调用。SpringMVC的这种Interceptor链式结构也是可以进行中断的，这种中断方式是令preHandle的返
     * 回值为false，当preHandle的返回值为false的时候整个请求就结束了。
     */
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        try {
            HandlerMethod hm = (HandlerMethod) handler;//1.如果没有对应的方法,那么这句会抛出类型转换异常
            RequiredAuth requiredAuth = hm.getMethodAnnotation(RequiredAuth.class);

            if (requiredAuth != null)
                for (String privilege : requiredAuth.auths())
                    if (!hasPermission(privilege, request.getSession()))
                        throw new PermissionDeniedException("权限不足");
        } catch (ClassCastException e) {
            //2.有这个异常,说明这个接口不需要权限验证,所以我们什么也不做
            //e.printStackTrace();
//            System.out.println("调用了无需权限验证的接口/资源");
        }
        return true;
    }

    private boolean hasPermission(String privilege, HttpSession session) {
        // TODO: 2018/7/18  处理权限认证逻辑
        return true;
    }
}
