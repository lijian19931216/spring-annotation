package com.luying.servlet;

import com.luying.filter.MyFilter;
import com.luying.listener.MyListener;

import javax.servlet.*;
import java.util.EnumSet;
import java.util.Set;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-21
 **/
public class MyServletInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        ServletRegistration.Dynamic myservlet = ctx.addServlet("myservlet", new MyServlet());
        myservlet.addMapping("/servlet");
        ctx.addListener(MyListener.class);
        FilterRegistration.Dynamic myfilter = ctx.addFilter("myfilter", MyFilter.class);
        myfilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true,"/*");

    }
}
