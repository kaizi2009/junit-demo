package com.github.junit.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kaizi2009
 */
@SpringBootApplication
@MapperScan("com.github.junit.demo.dao")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
