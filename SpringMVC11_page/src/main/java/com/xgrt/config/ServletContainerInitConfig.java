package com.xgrt.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};//根配置
    }

    //注意：SpringMVC的容器可以访问spring的容器
    // spring容器无法访问SpringMVC的容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};//专门应对web请求的处理
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
