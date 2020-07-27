package com.baoyong.test.mapper;

import com.baoyong.test.pojo.PersonInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
public class PersonInfoMapperImpl implements PersonInfoMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<PersonInfo> getPersonInfo() {
        PersonInfoMapper personInfoMapper = sqlSessionTemplate.getMapper(PersonInfoMapper.class);
        return personInfoMapper.getPersonInfo();
    }
}
