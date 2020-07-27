package com.baoyong.test;

import com.baoyong.test.mapper.PersonInfoMapper;
import com.baoyong.test.pojo.PersonInfo;
import com.mysql.cj.jdbc.Driver;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/**
 * @author JiangBaoyong
 * @date 2020/07/23
 **/
public class MybatisTest {
    @Test
    void testMybatis() throws IOException {
        String name = "mybatis-config.xml";
        InputStream io = Resources.getResourceAsStream(name);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(io);

        SqlSession sqlSession = factory.openSession(false);
        PersonInfoMapper mapper = sqlSession.getMapper(PersonInfoMapper.class);
        List<PersonInfo> list = mapper.getPersonInfo();

        if (Objects.nonNull(list)) {
            list.forEach(System.out::println);
        }
    }
}
