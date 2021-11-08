package com.furkanergun.productservice.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(name="created_at" ,nullable = false)
    private LocalDateTime createdAt;
}
