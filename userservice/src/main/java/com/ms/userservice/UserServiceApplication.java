package com.ms.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(UserServiceApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        String property = environment.getProperty("eureka.client.service-url.defaultZone");
        System.out.println("======================="+property);
        System.out.println(environment.getProperty("spring.datasource.url")+"=====================url");
    }

}
