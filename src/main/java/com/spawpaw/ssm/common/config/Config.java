package com.spawpaw.ssm.common.config;

/**
 * 项目的默认配置，比如说单词查询的最大条目数，也可以用其他方式配置
 *
 * @author BenBenShang   spawpaw@hotmail.com 2017.2.21
 */
public class Config {
    //max records per query
    public static final int max_page_size = 1000;

    public static boolean cache_need_to_be_refresh = true;

    /**
     * compress files ends with jsp/html/css/js
     * this option is only for optimizing the source code by delete unnecessary space or cr/lf
     * if you want to enable gzip, this option is useless. : )
     */
    public static final boolean optimize_jsp = false;
}
