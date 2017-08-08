package com.spawpaw.ssm.dao;

import com.spawpaw.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 */
public interface UserDAO {
    /**
     * 通过用户名获取用户，只返回一个记录
     *
     * @param user_name 要查询的用户
     * @return 该用户的信息（不包括密码）
     */
    User getUserByLoginName(@Param("user_name") String user_name);

    User getUserByUserId(@Param("id") int id);

    /**
     * 获取对应用户名的密码
     *
     * @param user_name 要查询的用户
     * @return 该用户的密码
     */
    String getPasswordByLoginName(@Param("user_name") String user_name);

    /**
     * 添加一个用户，未提供的参数皆为默认值
     */
    Integer createUser(@Param("req") User req);

    /**
     * 修改一个用户的个人信息
     */
    Integer updateUser(@Param("password") String password);
}
