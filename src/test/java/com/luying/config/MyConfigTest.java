package com.luying.config;

import com.luying.bean.Car;
import com.luying.bean.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigTest {
    /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    @Test
    public void testScan() {//打印容器中注册的bean
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        BookController bean = context.getBean(BookController.class);
      //  System.out.println(bean+"----------------");
        System.out.println("类型是："+context.getBean("getFactory").getClass());
        System.out.println("类型是："+context.getBean("&getFactory").getClass());
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
*/
    @Test
    public void testBeanLifeCycle() {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigLifeCycle.class);
        String[] definitionNames = context1.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        context1.getBean(Car.class);
        context1.close();

    }
    @Test
    public void testBean() {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigLifeCycle.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        System.out.println("---"+(Person) context.getBean(Person.class));


    }
}