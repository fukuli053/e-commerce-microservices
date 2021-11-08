package com.furkanergun.productservice.repositories;

import com.furkanergun.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
