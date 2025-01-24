package com.hhu.nacosconsumer9102.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
public interface NacosProviderService {

    @GetMapping("/helloProvider")
    public String helloProvider();

}
