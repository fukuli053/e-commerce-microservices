package com.furkanergun.productservice;

import com.furkanergun.productservice.controller.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class ProductServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProductServiceApplication.class, args);
		context.getBean(ProductController.class).fillWithTestData();
	}

}
