package com.internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("com.internship.model")
@EnableJpaRepositories("com.internship.repository")
@EnableTransactionManagement
public class InternshipTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(InternshipTrackerApplication.class, args);
    }
}


