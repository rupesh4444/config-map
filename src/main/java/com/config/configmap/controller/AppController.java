package com.config.configmap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ConfigurationProperties(prefix = "mssgs")
@RestController
public class AppController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${MESSAGE:default}")
    private String mssg;

    @Value("${FAVOURITE_COLOUR:default}")
    private String color;

    @Value("${FAVOURITE_FOOD:default}")
    private String food;

    @RequestMapping(value="/appName")
    public String getAppName() {
        return appName;
    }

    @RequestMapping(value="/mssgs")
    public String getConfigMapMssg() {
        return mssg;
    }

    @RequestMapping(value="/color")
    public String getColor() {
        return color;
    }

    @RequestMapping(value="/food")
    public String getFood() {
        return food;
    }

}
