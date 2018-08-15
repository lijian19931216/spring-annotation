package com.luying.config;

import com.luying.bean.Person;
import com.luying.controller.BookController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MyConfigTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    @Test
    public void testScan() {//打印容器中注册的bean
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        BookController bean = context.getBean(BookController.class);
        System.out.println(bean+"----------------");
    }

    @Test
    public void getPerson() {
      //   System.out.println(context.getBean(Person.class));
        String[] names = context.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println("bean name"+name);
        }
        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        String property = context.getEnvironment().getProperty("os.name");
    //    System.out.println(property);
        for (Map.Entry<String, Person> entry:beansOfType.entrySet()){
            System.out.println(entry.getKey()+"  :  "+entry.getValue());
        }

    }

    @Test
    public void testIoc() {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfig.class);
        context1.getBean("pson666");
        context1.getBean("pson667");
    }
}