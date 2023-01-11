package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xgrt.controller")
@EnableWebMvc//开启从JSON数据转换成对象的功能（是这句话的功能之一）
public class SpringMVCConfig {
}

