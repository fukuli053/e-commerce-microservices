package com.furkanergun.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fb")
public class HystrixController {

    @GetMapping("/auth")
    public String accountFallback(){
        return "Auth Service is not available.";
    }

    @GetMapping("/product")
    public String ticketFallback(){
        return "Product Service is not available.";
    }
}