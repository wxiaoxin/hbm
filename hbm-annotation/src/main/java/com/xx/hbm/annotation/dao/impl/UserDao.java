package com.xx.hbm.annotation.dao.impl;

import com.xx.hbm.annotation.dao.IUserDao;
import com.xx.hbm.annotation.entity.User;
import com.xx.hbm.start.base.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by wxiao on 2016.10.10.
 */

public class UserDao extends BaseDao implements IUserDao {


    public void save(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public int del(String id) {
        return 0;
    }

    public int update(User user) {
        return 0;
    }

    public User get(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = " from com.xx.hbm.annotation.entity.User where id = ? ";
        Query query = session.createQuery(hql);
        query.setString(0, id);
        User user = (User) query.uniqueResult();
        transaction.commit();
        session.close();
        return user;
    }
}
