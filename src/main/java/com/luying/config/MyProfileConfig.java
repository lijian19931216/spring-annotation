package com.luying.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


/**
 * @description: -Dspring.profiles.active=dev
 * @author: lijian
 * @create: 2018-08-17
 **/
@Configuration
@PropertySource("classpath:db.properties")
public class MyProfileConfig {
    @Value("db.username")
    private String user;
    @Value("db.pwd")
    private String pwd;
    @Value("db.driver")
    private String driver;
    @Profile("test")
    @Bean
    public DruidDataSource dataSourceTest(){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl("jdbc:mysql://localhost:3306/mytest?useUnicode=true&characterEncoding=UTF-8");
        datasource.setUsername(user);
        datasource.setPassword(pwd);
        datasource.setDriverClassName(driver);
        return datasource;

    }
    @Profile("dev")
    @Bean
    public DruidDataSource dataSourceDev(){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl("jdbc:mysql://localhost:3306/dev?useUnicode=true&characterEncoding=UTF-8");
        datasource.setUsername(user);
        datasource.setPassword(pwd);
        datasource.setDriverClassName(driver);
        return datasource;

    }
    @Profile("prod")
    @Bean
    public DruidDataSource dataSourceProd(){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl("jdbc:mysql://localhost:3306/shiro?useUnicode=true&characterEncoding=UTF-8");
        datasource.setUsername(user);
        datasource.setPassword(pwd);
        datasource.setDriverClassName(driver);
        return datasource;

    }
}
