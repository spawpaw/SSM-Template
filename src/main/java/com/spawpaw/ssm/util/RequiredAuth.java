package com.spawpaw.ssm.util;

import java.lang.annotation.*;

/**
 * 用于管理权限的注解
 * 在请求方法上添加该注解,如果session中对应的任何一个值为null,则抛出权限不足异常
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/8/23
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequiredAuth {
    String[] auths() default {};
}
