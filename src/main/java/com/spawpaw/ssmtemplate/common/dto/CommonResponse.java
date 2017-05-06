package com.spawpaw.ssmtemplate.common.dto;

/**
 * @author BenBenShang
 * @version: 1.0 2017.1.17
 * @copyright: 2017.1.17 spawpaw@hotmail.com
 * <p>
 * Description for this class:
 * 基础的Response模板
 * 理想情况下，每个response都应该继承自本类
 */
public class CommonResponse {
    private int status;//本次请求的状态，0为无错误，即请求被正确的处理，其余情况均为出错，
    private String msg;//可以作为展示给用户的提示消息，例如 “登录失败，密码错误”

    public CommonResponse(StatusEnum status) {
        this.status = status.code;
        this.msg = status.description;
    }

}