package com.janita.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Janita on 2017/6/29 0029-下午 8:09
 * 该类是：
 */
@SpringBootApplication
@MapperScan(basePackages ="com.janita.mybatis")
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
