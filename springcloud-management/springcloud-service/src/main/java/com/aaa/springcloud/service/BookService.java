package com.aaa.springcloud.service;

import com.aaa.springcloud.mapper.BookMapper;
import com.aaa.springcloud.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/4/27 21:43
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询全部书籍
     * @return
     */
    public List<BookInfo> selectAll(){
        return bookMapper.selectAll();
    }
}
