package com.luying.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
public class TimeHandler implements invokationHandler {
    @Override
    public void invoke(Method method,Object o) {
        long start=System.currentTimeMillis();
        try {
            method.invoke(o,new Object[]{});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }
}
