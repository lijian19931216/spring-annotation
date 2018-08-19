package com.luying.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
public class MyInvokerHandler implements InvocationHandler {
    Object o;

    public MyInvokerHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("说话之前");
        Object ob= method.invoke(o, args);
        System.out.println("说话之后");
        return  ob;
    }
}
