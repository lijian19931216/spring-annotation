package com.luying.proxy.jdk;

import com.luying.proxy.ciglib.CigligProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class XiaoMingTest {

    @Test
    public void say() {
        Person person=new XiaoMing();
        InvocationHandler in=new MyInvokerHandler(person);
        Person p= (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), in);
        System.out.println(p.say("晚上好"));
    }

    @Test
    public void ciglibTest() {
        CigligProxy proxy=new CigligProxy();
        XiaoMing xm= (XiaoMing) proxy.getProxy(XiaoMing.class);
        System.out.println(xm.say("ciglib  你好"));
    }
}