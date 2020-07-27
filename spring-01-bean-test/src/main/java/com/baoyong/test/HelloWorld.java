package com.baoyong.test;

/**
 * @author JiangBaoyong
 * @date 2020/07/19
 **/
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public HelloWorld setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}
