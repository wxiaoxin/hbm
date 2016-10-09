package com.xx.hbm.start.dao;

import com.xx.hbm.start.entity.Student;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 操作Student实体类的接口
 *
 */

public interface IStudentDao {

    /**
     * 保存学生
     * @param student
     */
    void save(Student student);

    /**
     * 删除学生
     * @param id
     */
    int del(String id);


    /**
     * 更新学生记录
     * @param student
     */
    int update(Student student);


    /**
     * 获取学生记录
     * @param id
     * @return
     */
    Student get(String id);

}
