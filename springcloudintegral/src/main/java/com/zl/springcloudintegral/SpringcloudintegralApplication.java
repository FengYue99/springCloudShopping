package com.zl.springcloudintegral;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fy
 */
@SpringBootApplication
@ComponentScan("com.zl")
@MapperScan("com.zl.dao")
@EnableEurekaClient
public class SpringcloudintegralApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudintegralApplication.class, args);
    }

}
