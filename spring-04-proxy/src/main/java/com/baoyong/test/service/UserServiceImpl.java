package com.baoyong.test.service;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("执行add方法");
    }

    @Override
    public void reduce() {
        System.out.println("执行reduce方法");
    }
}
