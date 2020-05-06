package com.aaa.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/6 22:00
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @GetMapping("/test")
    public String test() {
        return port+"--------------"+driverClassName;
    }

}
