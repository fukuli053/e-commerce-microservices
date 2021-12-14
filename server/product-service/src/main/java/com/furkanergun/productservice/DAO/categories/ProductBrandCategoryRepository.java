package com.furkanergun.productservice.DAO.categories;

import com.furkanergun.productservice.entity.category.ProductBrandCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductBrandCategoryRepository extends JpaRepository<ProductBrandCategory, Integer> {

    @Query(value = "SELECT p FROM ProductBrandCategory p")
    List<ProductBrandCategory> getAllData();

    ProductBrandCategory findByType(String brandName);
}
