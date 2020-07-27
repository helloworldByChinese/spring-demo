package com.baoyong.test.mapper;

import com.baoyong.test.pojo.PersonInfo;

import java.util.List;

/**
 *  和mybatis-and-spring demo中是一样的
 *
 * @author JiangBaoyong
 * @date 2020/07/23
 **/
public interface PersonInfoMapper {
    List<PersonInfo> getPersonInfo();
}
