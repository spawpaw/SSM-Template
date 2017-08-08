package com.spawpaw.ssm.common.config;

/**
 * 项目的默认配置，比如说单词查询的最大条目数，也可以用其他方式配置
 *
 * @author BenBenShang   spawpaw@hotmail.com 2017.2.21
 */
public class Config {
    //max records per query
    public static final int MAX_PAGE_SIZE = 1000;


    /**
     * 在响应体中打印异常栈
     */
    public static final boolean SHOW_ERROR_STACK_TRACE_IN_RESPONSE = true;

    /**
     * compress files ends with jsp/html/css/js
     * this option is only for optimizing the source code by delete unnecessary space or cr/lf
     * if you want to enable gzip, this option is useless. : )
     */
    public static final boolean optimize_jsp = false;
}
