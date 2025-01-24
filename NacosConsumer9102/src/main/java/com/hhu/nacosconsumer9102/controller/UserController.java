package com.hhu.nacosconsumer9102.controller;

import com.hhu.nacosconsumer9102.config.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private NacosProviderService providerService;

    @GetMapping(value = "/helloOpenFegin")
    public String getDiscovery2(){
        return providerService.helloProvider();
    }
}
