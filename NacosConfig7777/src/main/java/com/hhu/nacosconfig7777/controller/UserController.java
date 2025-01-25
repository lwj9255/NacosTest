package com.hhu.nacosconfig7777.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //支持Nacos的动态刷新功能
public class UserController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/hello")
    public String hello(){
        return configInfo;
    }
}
