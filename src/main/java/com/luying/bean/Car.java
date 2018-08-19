package com.luying.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-16
 **/
public class Car {
    public Car() {
        System.out.println("car  构造器");
    }
    @PostConstruct
    public void init(){
        System.out.println("car   初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("car   销毁");
    }
}

