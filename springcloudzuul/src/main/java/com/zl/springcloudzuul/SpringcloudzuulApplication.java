package com.zl.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fy
 */
@SpringBootApplication
@EnableEurekaClient
//开启网关功能
@EnableZuulProxy
@ComponentScan("com.zl")

public class SpringcloudzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudzuulApplication.class, args);
    }

}
