package com.luying.web;

import com.luying.web.config.AppConfig;
import com.luying.web.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
//web启动创建对象
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override//spring 配置文件
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override//springmvc 配置文件
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override//拦截所有资源 不包括。jsp
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
