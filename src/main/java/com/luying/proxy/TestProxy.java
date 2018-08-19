package com.luying.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
public class TestProxy {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String fileName="E:\\ideaworkspace\\spring-annotation\\src\\main\\java\\com\\luying\\proxy\\TankTimeProxy.java";
        JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager=compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask task=compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        manager.close();
        System.out.println(compiler);
        URL[] urls = {new URL("file:/E:/ideaworkspace/spring-annotation/src")};
        URLClassLoader urlClassLoader=new URLClassLoader(urls);
        Class aClass = urlClassLoader.loadClass("com.luying.proxy.TankTimeProxy");
        System.out.println(aClass);
        Constructor constructor = aClass.getConstructor(Moveable.class);
        Moveable m = (Moveable) constructor.newInstance(new Tank());
        m.move();
        Method[] methods = Moveable.class.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
