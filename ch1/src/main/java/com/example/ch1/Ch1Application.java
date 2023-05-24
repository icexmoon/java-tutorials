package com.example.ch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.ch1.repository")
@EntityScan("com.example.ch1.entity")
@SpringBootApplication
public class Ch1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch1Application.class, args);
    }

}
