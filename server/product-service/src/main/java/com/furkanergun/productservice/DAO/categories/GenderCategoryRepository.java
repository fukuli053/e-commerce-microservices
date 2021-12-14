package com.furkanergun.productservice.DAO.categories;


import com.furkanergun.productservice.entity.category.GenderCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenderCategoryRepository extends JpaRepository<GenderCategory, Integer> {

    @Query(value = "SELECT g FROM GenderCategory g")
    List<GenderCategory> getAllData();

    GenderCategory findByType(String gender);
}
