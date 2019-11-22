package com.zl.springcloudgoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fy
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.zl")
@MapperScan("com.zl.dao")
//指定api所在位置
@EnableFeignClients("com.zl.api")
//开启熔断器
@EnableCircuitBreaker

public class SpringcloudgoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudgoodsApplication.class, args);
    }

}
