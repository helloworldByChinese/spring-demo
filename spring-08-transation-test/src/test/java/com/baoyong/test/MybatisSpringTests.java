package com.baoyong.test;

import com.baoyong.test.service.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
public class MybatisSpringTests {
    /**
     *  此处事务测试 可以通过增加异常来判断是否符合，例如写个错误的删除操作，观察是否正常入库
     *  步骤：
     *      1. 实例化事务bean
     *      2. 配置事务通知
     *      3. 配置对应的切入点
     *      4. 实例化测试类的bean
     */
    @Test
    void testMybatisSpring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookMapper = context.getBean("bookServiceImpl", BookServiceImpl.class);
        bookMapper.testDemo();
    }

    /**
     * 测试事务传播机制 方法最终是否与tx:method顺序有关
     *  结果是有关的，排前面的能匹配上方法则会直接会采用对应的事务传播机制
     */
    @Test
    void testTxMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookMapper = context.getBean("bookServiceImpl", BookServiceImpl.class);
        bookMapper.getDemo();
    }
}
