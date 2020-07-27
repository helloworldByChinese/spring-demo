package com.baoyong.test.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author JiangBaoyong
 * @date 2020/07/23
 **/
@Data
public class PersonInfo {
    private int id;
    private String name;
    private Date birthday;
    private String phoneNumber;
    private String country;
}
