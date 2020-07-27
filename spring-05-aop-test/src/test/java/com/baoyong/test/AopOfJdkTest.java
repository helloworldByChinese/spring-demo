package com.baoyong.test;

import com.baoyong.test.bean.UserService;
import com.baoyong.test.bean.UserServiceImpl;
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
        // 此处默认的是JDK动态代理，所以需要转换成接口类，而不能转换成实现类
//        UserService userService = context.getBean("userService", UserService.class);
        // 强制使用cglib后
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);

        userService.reduce();
        userService.add();
    }
}
