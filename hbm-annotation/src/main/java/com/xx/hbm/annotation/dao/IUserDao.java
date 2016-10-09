package com.xx.hbm.annotation.dao;

import com.xx.hbm.annotation.entity.User;

/**
 * Created by wxiao on 2016.10.10.
 */
public interface IUserDao {

    void save(User user);

    int del(String id);

    int update(User user);

    User get(String id);

}
