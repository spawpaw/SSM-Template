package com.spawpaw.ssm.entity;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author BenBenShang 2017/4/21. spawpaw@hotmail.com
 */
public class User implements Serializable {
    private Integer id;
    private String user_name;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
