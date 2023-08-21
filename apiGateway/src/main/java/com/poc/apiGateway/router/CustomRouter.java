package com.poc.apiGateway.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRouter {

//    @Bean
//    public RouteLocator customRoute(RouteLocatorBuilder builder){
//        return builder.routes().route("path_route", pr -> pr.path("/item/**").uri("lb://ITEMS")).build();
//    }

}
