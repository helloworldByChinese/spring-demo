package com.baoyong.test;

import com.baoyong.test.bean.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class AopOfJdkTest {
    @Test
    void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.reduce();
        userService.add();
    }
}
