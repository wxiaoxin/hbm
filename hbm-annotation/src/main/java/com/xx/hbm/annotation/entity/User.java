package com.xx.hbm.annotation.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 用户实体类
 *
 */

@Entity
@Table(name = "t_user")
public class User {

    /**
     * 主键
     */
    @Id
    @Column(length = 32)
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 地址
     */
    @Embedded
    private Address address;

    @Column(name = "create_time")
    private Date createTime;

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address=" + address +
                ", createTime=" + createTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
