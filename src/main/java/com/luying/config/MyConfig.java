package com.luying.config;

import com.luying.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 配置类等同于配置文件
 * @author: lijian
 * @create: 2018-08-14
 **/
@Configuration
@ComponentScan("com.luying")
public class MyConfig {
    @Bean("person")//默认方法名做bean id
    public Person getPerson1(){
        return new Person("lijian", 25);
    }


}
