package com.zl.testrestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author fy
 */
@SpringBootApplication
@ComponentScan("com.zl")
public class TestrestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestrestfulApplication.class, args);
    }

}
