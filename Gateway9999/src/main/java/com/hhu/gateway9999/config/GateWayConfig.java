package com.hhu.gateway9999.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class GateWayConfig {
    //@Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        //构建多个路由routes
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        //具体路由地址
        builder.route("nacos-provider-route",r->r.path("/nacos-provider/**")
                .uri("http://192.168.159.1:9001/nacos-provider"));
        //返回路由规则
        return  builder.build();
    }
}
