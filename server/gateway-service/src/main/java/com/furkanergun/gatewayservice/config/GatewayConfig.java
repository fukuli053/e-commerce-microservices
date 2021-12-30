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
                .route("products", r -> r.path("/products/**")
                        .filters(f -> f.filter(filter).rewritePath("/products/(?<segment>.*)", "/$\\{segment}"))
                        .uri("lb://PRODUCT-SERVICE"))
                .route("suggestion-service", r -> r.path("/suggestion/**")
                        .filters(f -> f.filter(filter).rewritePath("/suggestion/(?<segment>.*)", "/$\\{segment}"))
                        .uri("lb://SUGGESTION-SEARCH-SERVICE"))
                .build();
    }
}
