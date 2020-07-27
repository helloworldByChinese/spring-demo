package com.baoyong.test;

import com.baoyong.test.mapper.PersonInfoMapper;
import com.baoyong.test.mapper2.BookMapper;
import com.baoyong.test.pojo.Book;
import com.baoyong.test.pojo.PersonInfo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
public class MybatisSpringTests {
    /**
     *  实体类和接口类以及mapper.xml与mybatis-and-spring中一致
     *  区别：
     *      1. 数据源的配置不一样，前者是给mybatis配置的，后者则是由专门的数据源管理类来处理
     *          eg: jdbc 的 org.springframework.jdbc.datasource.DriverManagerDataSource
     *      2. 此处需要手动配置sqlSessionFactory，且sqlSessionFactory需要与前面配置的其中一个数据源关联。
     *      3. 然后就是配置对应mapper接口文件夹与sqlSessionFactory关联（对应一个项目多个mapper目录关联不同的数据库）
     */
    @Test
    void testMybatisSpring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonInfoMapper personInfoMapper = context.getBean("personInfoMapper", PersonInfoMapper.class);
        List<PersonInfo> personInfoList = personInfoMapper.getPersonInfo();
        BookMapper bookMapper = context.getBean("bookMapper", BookMapper.class);
        List<Book> bookList = bookMapper.getBooks();

        personInfoList.forEach(System.out::println);

        bookList.forEach(System.out::println);
    }
}
