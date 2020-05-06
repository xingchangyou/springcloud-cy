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
 * @date 2020/5/5 0:00
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<BookInfo> selectAll() throws Exception {
        System.out.println("8084");
        List<BookInfo> bookInfos = bookService.selectAll();
        if(bookInfos.size() > 0) {
            // 说明数据库中有值，说明程序是对的(按照咱们目前的情况，一定会进if中)
            // 所以直接抛出异常
            throw new Exception("故意抛出异常");
        }
        return bookInfos;
    }
}
