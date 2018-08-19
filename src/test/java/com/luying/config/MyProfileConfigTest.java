package com.luying.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyProfileConfigTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();


    @Test
    public void dataSource() {
        context.getEnvironment().setActiveProfiles("dev","test");
        context.register(MyProfileConfig.class);
        context.refresh();
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void dataSourceDev() {
    }

    @Test
    public void dataSourceProd() {
    }
}