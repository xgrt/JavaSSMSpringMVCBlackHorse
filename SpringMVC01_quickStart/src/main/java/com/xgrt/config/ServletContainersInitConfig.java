package com.xgrt.config;

//4、定义一个Servlet容器启动的配置类，在里面加载Spring的配置

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    //加载SpringMVC容器配置
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext atx = new AnnotationConfigWebApplicationContext();
        atx.register(SpringMVCConfig.class);
        return atx;
    }

    @Override
    //设置了哪些请求归属SpringMVC处理
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    //加载Spring容器的配置
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
