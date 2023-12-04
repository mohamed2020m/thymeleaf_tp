package com.leeuw.thymeleaf_tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.leeuw.domain")
@ComponentScan(basePackages = {"com.leeuw.controller"})
@EnableJpaRepositories(basePackages = "com.leeuw.repository")
public class ThymeleafTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafTpApplication.class, args);
    }

}
