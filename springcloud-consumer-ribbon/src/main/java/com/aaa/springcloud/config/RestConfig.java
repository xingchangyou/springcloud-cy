package com.aaa.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/4 22:04
 */
@Configuration
public class RestConfig {

    /**
     * 不指定算法则启动默认轮询算法
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * @author Seven Lee
     * @description
     *      指定随机算法
     * @param []
     * @date 2020/4/29
     * @return com.netflix.loadbalancer.IRule
     * @throws
     **/
    /*@Bean
    public IRule mineRule() {
        return new RandomRule();
    }*/
}
