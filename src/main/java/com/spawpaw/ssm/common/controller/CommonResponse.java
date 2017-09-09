package com.spawpaw.ssm.common.controller;

/**
 * 通用响应体,为了抵御潜在的和已经存在的运营商劫持,不使用Http状态码来标记响应状态
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
public class CommonResponse<T> {
    public int code = 0;
    public String msg = "";
    public T data;


    public CommonResponse(T data) {
        this.code = 0;
        this.msg = "没毛病";
        this.data = data;
    }

    public CommonResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResponse(int code, String msg, T data) {
        this(code, msg);
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}