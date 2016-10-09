package com.xx.hbm.start.dao.impl;

import com.xx.hbm.start.dao.IStudentDao;
import com.xx.hbm.start.entity.Student;
import com.xx.hbm.start.util.UUIDGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 测试
 *
 */

public class StudentDaoTest {

    private IStudentDao studentDao;

    @Before
    public void before() {
        studentDao = new StudentDao();
    }

    @Test
    public void save() throws Exception {

        Student student = new Student();
        student.setId(UUIDGenerator.randomUUID());
        student.setSid("2012004085");
        student.setName("王建新");
        student.setAge(22);
        student.setCreatTime(new Date());

        studentDao.save(student);

    }

    @Test
    public void del() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void get() throws Exception {
        String id = "eafee187088340129445bedcd266ab40";
        Student student = studentDao.get(id);
        System.err.println(student);
    }

}