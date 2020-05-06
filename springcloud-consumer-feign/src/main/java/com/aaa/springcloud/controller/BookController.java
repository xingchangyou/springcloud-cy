package com.aaa.springcloud.controller;

import com.aaa.springcloud.model.BookInfo;
import com.aaa.springcloud.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/4 23:35
 */
@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/all")
    public List<BookInfo> selectAll(){
        return bookService.selectAll();
    }
}
