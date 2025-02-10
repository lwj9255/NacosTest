package com.hhu.stock.controller;

import com.hhu.stock.entity.StockEntity;
import com.hhu.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StockController {

    @Autowired
    private StockService service;

    @ResponseBody
    @GetMapping("/query")
    public String query(){
        System.out.println("---------------");
        return service.list().toString();
    }

    @ResponseBody
    @GetMapping("/decrement")
    public void decrement(){
        System.out.println("------扣减库存---------");
        StockEntity entity = service.getById(1);
        entity.setCount(entity.getCount()-1);
        service.updateById(entity);
    }
}
