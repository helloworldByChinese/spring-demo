package com.baoyong.test.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class LogMethodsAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "方法执行后的公共业务");
    }
}
