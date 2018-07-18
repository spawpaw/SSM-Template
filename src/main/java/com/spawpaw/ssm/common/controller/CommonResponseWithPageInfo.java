package com.spawpaw.ssm.common.controller;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/7
 */
public class CommonResponseWithPageInfo<T> extends CommonResponse<T> {
    PageInfo pageInfo;


    public CommonResponseWithPageInfo(int code, String msg) {
        super(code, msg);
    }

    public CommonResponseWithPageInfo(T data, PageInfo pageInfo) {
        super(data);
        this.pageInfo = pageInfo;
    }

}
