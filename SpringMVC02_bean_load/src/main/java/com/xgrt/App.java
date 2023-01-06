package com.xgrt;

import com.xgrt.config.SpringConfig;
import com.xgrt.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext atx=new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(atx.getBean(UserController.class));
        //把SpringMVCConfig类的@Configuration注释掉后，就会报NoSuchBeanDefinitionException
        //没有注释掉就不会报错，为什么？
        /*
        * 在设定扫描时，如果类上有@Configuration注释，也会被扫描上去，同时bean也会被加载
        * */
    }
}
