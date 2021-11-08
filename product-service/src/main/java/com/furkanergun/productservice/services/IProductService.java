package com.furkanergun.productservice.services;

import com.furkanergun.productservice.models.Product;

import java.util.List;

public interface IProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
