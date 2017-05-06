package com.spawpaw.ssmtemplate.common.dto;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0 2017.2.21
 * @copyright:  2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * Description for this class:
 * <p>$desc
 */
public enum StatusEnum {
    SUCCESS(0, "OK"),

    LOGIN_FAILURE(100, "用户登录失败"),
    LOGIN_FAILURE_WRONG_LOGIN_NAME(101, "用户登录失败,不存在此用户"),
    LOGIN_FAILURE_WRONG_PASSWORD(102, "用户登录失败，密码错误"),

    GET_RESOURCE_FAILURE_NOT_LOGIN(401, "获取请求资源失败，用户未登录"),
    GET_RESOURCE_FAILURE_INSUFFICIENT_PERMISSION(402, "获取请求资源失败，用户权限不足"),

    GET_RESOURCE_FAILURE_SERVER_CRASH(500, "请求处理失败，服务器内部错误");

    public final int code;
    public final String description;

    StatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
