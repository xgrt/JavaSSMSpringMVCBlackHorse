package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.xgrt.service"})
@PropertySource("jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
