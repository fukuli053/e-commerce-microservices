package com.furkanergun.suggestionsearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SuggestionSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuggestionSearchServiceApplication.class, args);
	}

}
