package com.luying.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-15
 **/
public class IfWindows implements Condition {
    /** 
     * @Description:
     * @Param: [context:条件能使用的上下文环境,
     *          metadata：注释信息]
     * @return: boolean 
     * @Author: lijian 
     * @Date: 2018/8/15 
     */ 
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取 ioc 的beanfactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取类加载器
        ClassLoader beanClassLoader = context.getClassLoader();
        Environment environment = context.getEnvironment();
        //获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        String property = environment.getProperty("os.name");

        if (property.contains("Windows7")){
            return true;

        }else {

            return true;
        }


    }

}
