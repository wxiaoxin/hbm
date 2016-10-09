package com.xx.hbm.annotation.dao.impl;

import com.xx.hbm.annotation.dao.IUserDao;
import com.xx.hbm.annotation.entity.Address;
import com.xx.hbm.annotation.entity.User;
import com.xx.hbm.start.util.UUIDGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 操作用户实体类DAO的测试类
 *
 */

public class UserDaoTest {


    private IUserDao userDao;

    @Before
    public void before() {
        userDao = new UserDao();
    }

    @Test
    public void save() throws Exception {

        Address address = new Address();
        address.setProvince("安徽");
        address.setCity("六安市");

        User user = new User();
        user.setId(UUIDGenerator.randomUUID());
        user.setName("tom");
        user.setPwd("123456");
        user.setAddress(address);
        user.setCreateTime(new Date());
        userDao.save(user);
    }

    @Test
    public void del() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

}