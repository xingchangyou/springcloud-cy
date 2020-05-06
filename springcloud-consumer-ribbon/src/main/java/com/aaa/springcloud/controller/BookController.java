package com.aaa.springcloud.controller;

import com.aaa.springcloud.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/4 22:09
 */
@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/")
    public List<BookInfo> selectAll(){
        return  restTemplate.getForObject("http://BOOK-PROVIDER/all", List.class);
    }

    /**
     * ribbon负载均衡脱离eureka注册中心
     * @return
     */
    @GetMapping("/noeureka")
    public List<BookInfo> selectAllNoEureka(){
        ServiceInstance serviceInstance =  loadBalancerClient.choose("book-provider");
        String host = serviceInstance.getHost();
        System.out.println(host);
        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/all",List.class);
    }
}
