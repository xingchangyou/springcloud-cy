package com.aaa.springcloud.fallback;

import com.aaa.springcloud.model.BookInfo;
import com.aaa.springcloud.service.IBookService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cy
 * @version 1.0
 * @date 2020/5/5 0:04
 *          统一熔断处理
 */
@Component
public class FallbackService implements FallbackFactory<IBookService> {

    public IBookService create(Throwable throwable) {
        //new 出唯一接口 重写接口方法
        final IBookService bookService = new IBookService() {
            public List<BookInfo> selectAll() {
                System.out.println("目前服务器正在处于降级阶段，请等待恢复通知！！");
                List list = new ArrayList();
                list.add("目前服务器正在处于降级阶段，请等待恢复通知！！");
                return list;
            }

        };
        return bookService;
    }
}
