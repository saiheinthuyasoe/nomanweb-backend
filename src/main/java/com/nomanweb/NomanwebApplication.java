package com.nomanweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nomanweb", "com.nomanweb.controllers", "com.nomanweb.services"})
@EntityScan("com.nomanweb.models")
@EnableJpaRepositories("com.nomanweb.repositories")
public class NomanwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NomanwebApplication.class, args);
    }
}
