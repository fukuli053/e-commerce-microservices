package com.furkanergun.gatewayservice.config;

import com.furkanergun.gatewayservice.filter.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes().route("auth", r -> r.path("/auth/**")
                .filters(f -> f.filter(filter).rewritePath("/auth/(?<segment>.*)", "/$\\{segment}"))
                .uri("lb://AUTH-SERVER"))
                .route("alert", r -> r.path("/alert/**").filters(f -> f.filter(filter)).uri("lb://alert"))
                .build();
    }

}