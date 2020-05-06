package com.aaa.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 实体类
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo implements Serializable {
    private Integer bookId;

    private String bookName;

    private Integer bookStore;

    private BigDecimal bookPrice;

    private Integer bookState;


}