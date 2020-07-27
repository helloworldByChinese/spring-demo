package com.baoyong.test.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class LogMethodsBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "方法执行前的公共业务");
    }
}
