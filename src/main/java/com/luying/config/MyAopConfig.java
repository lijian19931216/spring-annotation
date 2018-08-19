package com.luying.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
@Configuration
@ComponentScan("com.luying.aop")
@EnableAspectJAutoProxy//开启基于注解的aop
public class MyAopConfig {


}
