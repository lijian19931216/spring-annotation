package com.luying.proxy.ciglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
public class CigligProxy implements MethodInterceptor {
    Enhancer enhancer=new Enhancer();
    public Object getProxy(Class cla){
        enhancer.setSuperclass(cla);
        enhancer.setCallback(this);
        return enhancer.create();


    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("ciglib说前");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("ciglib说后");
        return o1;
    }
}
