package com.baoyong.test.staticdemo;

import com.baoyong.test.service.UserService;
import com.baoyong.test.service.UserServiceImpl;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class StaticProxy implements UserService {
    private UserService userService = new UserServiceImpl();

    @Override
    public void add() {
        before();
        userService.add();
        after();
    }

    @Override
    public void reduce() {
        before();
        userService.reduce();
        after();
    }

    private void before() {
        System.out.println("方法执行前");
    }

    private void after() {
        System.out.println("方法执行后");
    }
}
