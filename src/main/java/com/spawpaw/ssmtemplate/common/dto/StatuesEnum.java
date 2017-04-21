package com.spawpaw.ssmtemplate.common.dto;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0 2017.2.21
 * @copyright: <p> 2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.<br/>
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.</br>
 * view details: https://creativecommons.org/licenses/by-nc-sa/4.0/
 * </p>
 * <p>
 * Description for this class:
 * <p>$desc
 */
public enum StatuesEnum {
    SUCCESS(0, "请求得到正确响应"),

    LOGIN_FAILURE(10, "用户登录失败"),
    LOGIN_FAILURE_WRONG_LOGIN_NAME(11, "用户登录失败,不存在此用户"),
    LOGIN_FAILURE_WRONG_PASSWORD(12, "用户登录失败，密码错误"),

    GET_RESOURCE_FAILURE_NOT_LOGIN(41, "获取请求资源失败，用户未登录"),
    GET_RESOURCE_FAILURE_INSUFFICIENT_PERMISSION(42, "获取请求资源失败，用户权限不足"),

    GET_RESOURCE_FAILURE_SERVER_CRASH(50, "请求处理失败，服务器内部错误");

    public final int code;
    public final String description;

    StatuesEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
