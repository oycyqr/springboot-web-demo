package com.zhx.springbootwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.zhx.springbootwebdemo.mapper") //扫描的mapper
public class SpringbootWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebDemoApplication.class, args);
    }

}
