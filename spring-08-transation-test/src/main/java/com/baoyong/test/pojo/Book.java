package com.baoyong.test.pojo;

import lombok.Data;

/**
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
@Data
public class Book {
    private String id;
    private String name;
    private int number;

    public Book() {
    }

    public Book(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
