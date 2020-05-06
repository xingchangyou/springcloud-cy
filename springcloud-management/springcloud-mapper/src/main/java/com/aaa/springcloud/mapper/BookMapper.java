package com.aaa.springcloud.mapper;




import com.aaa.springcloud.model.BookInfo;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BookInfo record);

    BookInfo selectByPrimaryKey(Long id);

    List<BookInfo> selectAll();

    int updateByPrimaryKey(BookInfo record);
}