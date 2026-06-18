package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "property")
public class TestConfig {
@Autowired
    private org.springframework.core.env.Environment env;

    private String reload;
    private String reload2;
    public org.springframework.core.env.Environment getEnv() {
        return env;
    }
    public void setEnv(org.springframework.core.env.Environment env) {
        this.env = env;
    }
    public String getReload() {
        return reload;
    }
    public void setReload(String reload) {
        this.reload = reload;
    }
    public String getReload2() {
        return reload2;
    }
    public void setReload2(String reload2) {
        this.reload2 = reload2;
    }

    
}
