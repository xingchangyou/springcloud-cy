package com.aaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/8 23:34
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun5081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class, args);
    }
}
