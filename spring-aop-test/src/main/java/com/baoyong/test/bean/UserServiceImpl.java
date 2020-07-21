package com.baoyong.test.bean;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add方法业务执行中！！！");
    }

    @Override
    public void reduce() {
        System.out.println("reduce方法业务执行中！！！");
    }

}
