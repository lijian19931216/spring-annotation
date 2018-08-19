package com.luying.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-16
 **/
public class PersonFactory implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
