package com.baoyong.test.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author JiangBaoyong
 * @date 2020/07/22
 **/
@Aspect
public class AnnotationAspect {
    @Pointcut("execution(* com.baoyong.test.bean.*.*(..))")
    private void common(){}

//    @Before("execution(* com.baoyong.test.bean.*.*(..))")
    @Before("common()")
    public void before() {
        System.out.println("注解实现的前置方法");
    }

//    @Around("execution(* com.baoyong.test.bean.*.*(..))")
    @Around("common()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕执行前");
        joinPoint.proceed();
        System.out.println("环绕执行后");
    }

//    @After("execution(* com.baoyong.test.bean.*.*(..))")
    @After("common()")
    public void after() {
        System.out.println("注解实现的后置方法");
    }
}
