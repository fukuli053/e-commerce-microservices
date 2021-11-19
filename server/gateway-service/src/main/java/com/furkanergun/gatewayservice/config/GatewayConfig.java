package com.furkanergun.gatewayservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/users/**")
                        .filters(f -> f.filter(filter))
                        .uri("http://user-service:3335"))

                .route("product-service", r -> r.path("/products/**")
                        .filters(f -> f.filter(filter))
                        .uri("http://product-service:3333"))

                .route("auth-server", r -> r.path("/auth/**")
                        .filters(f -> f.filter(filter))
                        .uri("http://auth-server:5454"))
                .build();
    }

}