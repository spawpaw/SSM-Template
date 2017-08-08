package com.spawpaw.ssm.common.dto;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017.1.17
 *         <p>
 * @ a unified response for this project,all response forms like it.
 */
public class CommonResponse<T> {
    private int code;//本次请求的状态，0为无错误，即请求被正确的处理，其余情况均为出错，
    private String msg;//可以作为展示给用户的提示消息，例如 “登录失败，密码错误”
    private T data;//返回的对象

    /**
     * 能成功响应请求时，调用此构造方法
     *
     * @param msg  消息
     * @param data 数据
     */
    public CommonResponse(String msg, T data) {
        this.code = 0;
        this.msg = msg == null || msg.equals("") ? "没毛病!" : msg;
        this.data = data;
    }

    /**
     * 能成功响应请求时，调用此构造方法
     *
     * @param data 数据
     */
    public CommonResponse(T data) {
        this(null, data);
    }

    /**
     * 当服务遇到异常时调用此构造函数
     *
     * @param code 错误代码
     * @param msg  关于此错误的描述
     */
    public CommonResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回无数据的json
     */
    public String toJson() {
        return "{" +
                "\"code\":" + code +
                ",\"msg\":\"" + msg + '\"' +
                ",\"data\":null" +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
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
}