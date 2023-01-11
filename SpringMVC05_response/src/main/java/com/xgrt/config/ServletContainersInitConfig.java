package com.xgrt.config;

import jakarta.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //乱码处理（Tomcat8之前需要）
    @Override
    //post乱码
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter encodingFilter=new CharacterEncodingFilter();//SpringMVC自带的filter
        encodingFilter.setEncoding("utf-8");
        return new Filter[]{encodingFilter};
    }
}
