package com.aaa.springcloud.service;

import com.aaa.springcloud.fallback.FallbackService;
import com.aaa.springcloud.model.BookInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/4 23:30
 *          api接口一个项目只能有一个 这里起名IBookService不合适。
 *          fallbackFactory后备类熔断工厂指向api里的熔断工厂
 */
@FeignClient(value = "book-provider",fallbackFactory = FallbackService.class)
public interface IBookService {

    /**
     * 这个方法必须和feign里controller保持一致
     * @return
     */
    @GetMapping("/all")
    List<BookInfo> selectAll();

}
