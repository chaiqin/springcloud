package com.chq.springcloud.config;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
 
 
@Configuration
@MapperScan({"com.chq.springcloud.dao"})
public class MyBatisConfig {
 
}
 
