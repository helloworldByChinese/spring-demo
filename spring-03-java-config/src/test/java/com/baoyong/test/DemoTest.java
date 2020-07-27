package com.baoyong.test;

import com.baoyong.test.bean.UserBean;
import com.baoyong.test.config.UserConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author JiangBaoyong
 * @date 2020/07/20
 **/
public class DemoTest {
    @Test
    void testConfig() {
        // 不同的Context处理不同的配置
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        UserBean userBean = context.getBean("getUserBean", UserBean.class);
        System.out.println(userBean.getId() + "---------" + userBean.getName());
        Assertions.assertEquals("byJiang", userBean.getName());
        Assertions.assertEquals(123, userBean.getId());
    }
}
