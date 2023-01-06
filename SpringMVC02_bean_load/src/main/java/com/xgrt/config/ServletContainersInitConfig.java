package com.xgrt.config;

//4、定义一个Servlet容器启动的配置类，在里面加载Spring的配置

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/*
* 简化开发
* */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//    @Override
//    //加载SpringMVC容器配置
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext atx = new AnnotationConfigWebApplicationContext();//初始化一个空的AnnotationConfigWebApplicationContext容器
//        atx.register(SpringMVCConfig.class);//将SpringMVCConfig.class注册到容器中，即加载具体的配置
//        return atx;
//    }
//
//    @Override
//    //加载Spring容器的配置
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext atx = new AnnotationConfigWebApplicationContext();//初始化一个空的AnnotationConfigWebApplicationContext容器
//        atx.register(SpringConfig.class);//将SpringMVCConfig.class注册到容器中，即加载具体的配置
//        return atx;
//    }
//
//    @Override
//    //设置了哪些请求归属SpringMVC处理
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//}


