package com.baoyong.test;

import com.baoyong.test.staticdemo.StaticProxy;
import org.junit.jupiter.api.Test;

/**
 * 静态代理实现
 *
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class StaticTest {
    @Test
    void testStaticProxy() {
        StaticProxy proxy = new StaticProxy();
        proxy.add();
        proxy.reduce();
    }
}
