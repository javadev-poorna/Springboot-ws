package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    private org.springframework.core.env.Environment env;

    @Value("${app.welcome-message}")
    private String message;

    @Autowired
    private TestConfig testConfig;

    @GetMapping("/message")
    public String getMessage() {
        System.out.println("Current welcome message: " + env.getProperty("test.message"));
        System.out.println("Current welcome message from TestConfig: " + testConfig.getReload());
        System.out.println("Current welcome message from TestConfig: " + testConfig.getReload2());
        return message;
    }
}