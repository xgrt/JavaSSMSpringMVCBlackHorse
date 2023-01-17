package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.xgrt.service","com.xgrt.dao"})
@PropertySource("classpath:jdbc.properties")//不加classpath: SpringMVC会报错 找不到文件[/jdbc.properties]
@Import({JDBCConfig.class, MyBatisConfig.class})
@EnableTransactionManagement//加上事务
public class SpringConfig {
}
