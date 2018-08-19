package com.luying.aop;

import com.luying.config.MyAopConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyLogAspectTest {


    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAopConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        MyCalculator myCalculator = context.getBean(MyCalculator.class);
        System.out.println(myCalculator);
        myCalculator.mydiv(6, 0);
    }
}