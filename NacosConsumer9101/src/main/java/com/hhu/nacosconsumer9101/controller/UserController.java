package com.hhu.nacosconsumer9101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/helloConsumer")
    public String helloConsumer(){
        System.out.println("----Nacos Consumer Run----");
        return restTemplate.getForObject(serverURL+"/helloProvider",String.class);
    }

    @GetMapping("/s1")
    public String s1(){
        System.out.println("s1启动成功");
        return "s1 ok";
    }

}
