package com.hhu.order.controller;

import com.hhu.order.feign.StockService;
import com.hhu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private StockService stockService;

    @ResponseBody
    @GetMapping("/createOrder")
    public String createOrder(){
        return orderService.create();
    }
}
