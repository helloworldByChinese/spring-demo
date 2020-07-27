package com.baoyong.test.dynamic;

import com.baoyong.test.service.UserService;
import com.baoyong.test.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理是基于接口实现的代理类
 *
 * 具有相同接口类的子类可同用一个动态代理类
 *
 * @author JiangBaoyong
 * @date 2020/07/21
 **/
public class DynamicInvocationHandler implements InvocationHandler {
    //
    private Object service;

    public DynamicInvocationHandler(Object service) {
        this.service = service;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method.getName());
        Object result = method.invoke(service, args);
        after(method.getName());
        return result;
    }

    private void before(String msg) {
        System.out.println( "执行" + msg + "方法前");
    }

    private void after(String msg) {
        System.out.println( "执行" + msg + "方法后");
    }
}
