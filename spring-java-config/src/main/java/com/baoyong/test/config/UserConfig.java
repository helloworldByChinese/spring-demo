package com.baoyong.test.config;

import com.baoyong.test.bean.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author JiangBaoyong
 * @date 2020/07/20
 **/
@Configuration
public class UserConfig {

    @Bean //(name = "myUser")
    public UserBean getUserBean() {
        return new UserBean();
    }
}
