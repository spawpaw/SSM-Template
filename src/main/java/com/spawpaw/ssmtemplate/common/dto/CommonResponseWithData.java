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
public class CommonResponseWithData<T> extends CommonResponse {
    private T data;//返回的对象

    public CommonResponseWithData(StatusEnum status, T data) {
        super(status);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}