package com.hwd.config;

import com.hwd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//也会被spring容器托管，他本来就是一个@Component
@Configuration
@ComponentScan("com.hwd.pojo")
public class myConfig {
    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();
    }
}
