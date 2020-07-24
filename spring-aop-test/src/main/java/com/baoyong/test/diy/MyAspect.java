package com.baoyong.test.diy;

/**
 * @author JiangBaoyong
 * @date 2020/07/22
 **/
public class MyAspect {

    public void before() {
        System.out.println("----自定义切面前置处理-------");
    }

    public void after() {
        System.out.println("--------自定义切面后置处理---------");
    }


}
