package com.xx.hbm.start.base;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 对于Hiberante SessionFactory的封装基础DAO类
 *
 */

public class BaseDao {

    protected static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

}
