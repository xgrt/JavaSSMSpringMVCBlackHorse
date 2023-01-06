package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//3、创建SpringMVC的配置文件，加载controller对应的bean
@Configuration
/*方式一：*/
//@ComponentScan({"com.xgrt.service","com.xgrt.dao"})//可以不写扫描dao包，但是通用性差

/*方式二：SpringBoot会有使用的地方*/
@ComponentScan(value = "com.xgrt",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,//过滤的类型，现在是按注解过滤
                classes = Controller.class
        )//排除一些不需要扫描的bean，注解是Controller
)
public class SpringConfig {
}
