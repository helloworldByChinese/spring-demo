package com.baoyong.test;

import com.baoyong.test.dynamic.DynamicInvocationHandler;
import com.baoyong.test.service.UserService;
import com.baoyong.test.service.UserServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class DynamicTest {
    @Test
    void testDynamic() {
        UserService userService = new UserServiceImpl();
        DynamicInvocationHandler invocationHandler = new DynamicInvocationHandler(userService);

        UserService proxy = (UserService) invocationHandler.getProxy();

        proxy.add();

        proxy.reduce();
    }
}
