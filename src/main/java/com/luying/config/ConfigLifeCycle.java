package com.luying.config;

import com.luying.bean.Car;
import com.luying.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-16
 **/
@Configuration
@PropertySource({"classpath:person.properties"})//读取外部配置文件
public class ConfigLifeCycle {
    @Bean/*(initMethod = "init",destroyMethod = "destroy")*/
    public Car getCar(){
        return new Car();
    }
    @Bean
    public Person getPerson(){
        return  new Person();
    }
}
