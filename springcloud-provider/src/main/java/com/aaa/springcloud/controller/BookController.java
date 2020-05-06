package com.aaa.springcloud.controller;

import com.aaa.springcloud.model.BookInfo;
import com.aaa.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/4/27 21:40
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * 查询所以图书
     * @return
     */
    @GetMapping("all")
    public List<BookInfo> selectAll(){
        System.out.println("8081");
        return bookService.selectAll();
    }
}
