package com.xx.hbm.start.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by wxiao on 2016.10.10.

 * 学生实体类
 */

@Entity
@Table(name = "t_student")
public class Student {

    /**
     * 主键
     */
    @Id
    @Column(length = 32)
    private String id;


    /**
     * 学号
     */
    private String sid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date creatTime;


    /**
     * 空构造器
     */
    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", creatTime=" + creatTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
