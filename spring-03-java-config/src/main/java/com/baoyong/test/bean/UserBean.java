package com.baoyong.test.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author JiangBaoyong
 * @date 2020/07/20
 **/
public class UserBean {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    @Value("123")
    public UserBean setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    @Value("byJiang")
    public UserBean setName(String name) {
        this.name = name;
        return this;
    }
}
