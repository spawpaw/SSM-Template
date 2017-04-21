package com.spawpaw.ssmtemplate.dao;

import com.spawpaw.ssmtemplate.entity.User;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0 2017.2.21
 * @copyright: spawpaw@hotmail.com CC-BY-NC-SA.
 *
 * 用于查询的DAO
 *
 */
public interface RetrieveDao {
    User getUserByUserName(String user_name);
}
