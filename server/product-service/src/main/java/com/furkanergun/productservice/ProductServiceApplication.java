package com.furkanergun.productservice;

import com.furkanergun.productservice.models.Product;
import com.furkanergun.productservice.services.IProductService;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.text.NumberFormat;
import java.util.Locale;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoData(IProductService productService) {
		return args -> {

			if (productService.findAllProducts().isEmpty()){
				Faker faker = new Faker();

				for (int i = 0; i < 100; i++){
					var product = new Product();
					product.setName(faker.commerce().productName());
					NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
					Number price = format.parse(faker.commerce().price());
					product.setPrice(price.doubleValue());
					productService.saveProduct(product);
				}
			}
		};
	}
}
