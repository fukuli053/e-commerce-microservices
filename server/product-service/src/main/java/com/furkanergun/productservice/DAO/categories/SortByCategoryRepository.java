package com.furkanergun.productservice.DAO.categories;

import com.furkanergun.productservice.entity.category.SortByCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SortByCategoryRepository extends JpaRepository<SortByCategory, Integer> {

    @Query(value = "SELECT s FROM SortByCategory s")
    List<SortByCategory> getAllData();

    SortByCategory findByType(String type);
}
