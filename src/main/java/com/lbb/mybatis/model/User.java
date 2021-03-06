package com.lbb.mybatis.model;

import java.util.Date;

/**
 *@date 2017/7/28
 *@author lubingbing
 *@descption User
 */
public class User {

    private Integer id;

    private String name;

    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}