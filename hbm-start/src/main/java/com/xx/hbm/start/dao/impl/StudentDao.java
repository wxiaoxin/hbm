package com.xx.hbm.start.dao.impl;

import com.xx.hbm.start.base.BaseDao;
import com.xx.hbm.start.dao.IStudentDao;
import com.xx.hbm.start.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 操作Student实体类的实现
 *
 */

public class StudentDao extends BaseDao implements IStudentDao {

    /**
     * 保存学生
     *
     * @param student
     */
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    /**
     * 删除学生
     *
     * @param id
     */
    public int del(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "delete from com.xx.hbm.start.entity.Student where id = ? ";
        Query query = session.createQuery(hql);
        query.setString(0, id);
        int row = query.executeUpdate();
        transaction.commit();
        session.close();
        return row;
    }

    /**
     * 更新学生记录
     *
     * @param student
     */
    public int update(Student student) {
        return 0;
    }

    /**
     * 获取学生记录
     *
     * @param id
     * @return
     */
    public Student get(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = " from com.xx.hbm.start.entity.Student where id = ? ";
        Query query = session.createQuery(hql);
        query.setString(0, id);
        Student student = (Student) query.uniqueResult();
        transaction.commit();
        session.close();
        return student;
    }
}
