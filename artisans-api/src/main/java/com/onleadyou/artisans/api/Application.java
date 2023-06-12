package com.onleadyou.artisans.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class })
public class Application {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(Application.class, args);
    }

}
