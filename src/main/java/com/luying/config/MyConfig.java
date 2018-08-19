package com.luying.config;

import com.luying.bean.Person;
import com.luying.bean.PersonFactory;
import com.luying.condition.IfWindows;
import com.luying.condition.MyImportSelector;
import org.springframework.context.annotation.*;

/**
 * @description: 配置类等同于配置文件
 * @author: lijian
 * @create: 2018-08-14
 **/
@Import(MyImportSelector.class)
@Conditional(IfWindows.class)
@Configuration
@ComponentScan(value = "com.luying",useDefaultFilters=false,includeFilters = {
       /* @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})*/
        @ComponentScan.Filter(type =FilterType.CUSTOM,classes = {MyTypeFilter.class})
}/*,excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
}*/)
public class MyConfig {

    @Bean//("pson666")//默认方法名做bean id
    public Person getPerson2(){
        System.out.println("getPerson2被创建------");
        return new Person("lijian", 25);
    }
 //   @Lazy
//    @Scope("prototype")
//    @Conditional(IfWindows.class)
    @Bean//("pson667")//默认方法名做bean id
    public Person getPerson1(){
        System.out.println("getPerson1被创建------");
        return new Person("张三", 25);
    }
    @Bean
    public PersonFactory getFactory(){
        return new PersonFactory();
    }

}
