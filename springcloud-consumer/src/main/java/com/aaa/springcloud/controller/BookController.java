package com.aaa.springcloud.controller;

import com.aaa.springcloud.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/4/27 22:07
 */
@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查询所以图书
     * @return
     */
    @GetMapping("selectAll")
    public List<BookInfo> selectAll(){
        return  restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}
