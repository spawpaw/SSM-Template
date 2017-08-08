package com.spawpaw.ssm.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author BenBenShang 2017/6/10.
 */
public class MD5 {

    //获取一个字符串的MD5值
    public static String getMD5(String message) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(message.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            //不可能出现这个异常，忽略之
            e.printStackTrace();
        }
        return "";
    }

    public static String getMD5(String message, String salt) {
        return getMD5(message + salt);
    }

    //测试
    public static void main(String[] args) {
        System.out.println(getMD5("123456"));
    }
}
