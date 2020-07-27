package com.baoyong.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author JiangBaoyong
 * @date 2020/07/19
 **/
@Configuration
public class SpringTest {
    @Test
    void testPerson() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
//        person.getCat().show();
        person.getDog().show();
        Assert.notNull(person, "person exist");
    }
}
