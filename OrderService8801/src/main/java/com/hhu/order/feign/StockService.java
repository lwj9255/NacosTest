package com.hhu.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("stock-service")
public interface StockService {
    @GetMapping("/query")
    public String query();

    @GetMapping("/decrement")
    public void decrement();
}
