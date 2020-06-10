package com.zys.seckill.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = "com.zys.seckill.*")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServerClass {
    public static void main(String[] args) {
        SpringApplication.run(ServerClass.class, args);
    }
}
