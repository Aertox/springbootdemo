package com.xs.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("com.xs.management.dao")//指向mapper文件在哪
@SpringBootApplication
public class ManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementApplication.class, args);
    }

}
