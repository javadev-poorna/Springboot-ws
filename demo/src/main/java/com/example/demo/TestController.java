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
    	System.out.println("TestController - message endpoint called");
        System.out.println("Current welcome message from Env: " + env.getProperty("test.message"));
        System.out.println("Current welcome message from TestConfig reload: " + testConfig.getReload());
        System.out.println("Current welcome message from TestConfig reload2: " + testConfig.getReload2());
        System.out.println("Current welcome message from TestController message @Value: " + message);
        return env.getProperty("test.message");
    }
}
