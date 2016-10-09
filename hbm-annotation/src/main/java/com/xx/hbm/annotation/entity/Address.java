package com.xx.hbm.annotation.entity;

import javax.persistence.Embeddable;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 地址信息类，将会作为hibernate中的一个嵌入类使用
 *
 */

@Embeddable
public class Address {

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
