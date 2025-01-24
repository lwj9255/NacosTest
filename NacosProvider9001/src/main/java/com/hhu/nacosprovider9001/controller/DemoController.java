package com.hhu.nacosprovider9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/helloProvider")
    public String helloProvider(){
        System.out.println("----Nacos Porvider Run----");
        return "Hello Nacos Discovery"+serverPort;
    }
}
