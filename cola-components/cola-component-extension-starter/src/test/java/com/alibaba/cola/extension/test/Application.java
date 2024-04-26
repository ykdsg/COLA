package com.alibaba.cola.extension.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application，通过spring.factories 配置了自动装配类
 *
 * @author Frank Zhang
 * @date 2020-11-10 3:58 PM
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
