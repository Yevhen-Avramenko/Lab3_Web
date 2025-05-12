package com.example.avramenko_kp23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class avramenko_kp23 {

    public static void main(String[] args) {
        SpringApplication.run(avramenko_kp23.class, args);
    }
}
