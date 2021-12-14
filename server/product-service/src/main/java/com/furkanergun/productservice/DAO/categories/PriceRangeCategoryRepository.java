package com.furkanergun.productservice.DAO.categories;

import com.furkanergun.productservice.entity.category.PriceRangeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PriceRangeCategoryRepository extends JpaRepository<PriceRangeCategory, Integer> {

    @Query(value = "SELECT p FROM PriceRangeCategory p")
    List<PriceRangeCategory> getAllData();

    PriceRangeCategory findByType(String type);
}
