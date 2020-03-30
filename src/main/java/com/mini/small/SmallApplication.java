package com.mini.small;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mini.small.dao")
public class SmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallApplication.class, args);
    }

}
