package com.furkanergun.productservice.controllers;

import com.furkanergun.productservice.models.Product;
import com.furkanergun.productservice.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products") //pre-path
public class ProductController
{
    private final IProductService productService;
    public ProductController(IProductService productService){
        this.productService = productService;
    }

    @PostMapping // -> api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}") //-> api/product/productId
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
    {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping // -> api/product
    public ResponseEntity<?> getAllProducts()
    {
        return ResponseEntity.ok(productService.findAllProducts());
    }
}