package com.spawpaw.ssm.common.controller;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/7
 */
public class CommonResponseWithPageHelper<T> extends CommonResponse<T> {
    PageHelper pageHelper;


    public CommonResponseWithPageHelper(int code, String msg) {
        super(code, msg);
    }

    public CommonResponseWithPageHelper(T data, PageHelper pageHelper) {
        super(data);
        this.pageHelper = pageHelper;
    }

}
