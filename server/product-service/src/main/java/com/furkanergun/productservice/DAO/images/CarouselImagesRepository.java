package com.furkanergun.productservice.DAO.images;

import com.furkanergun.productservice.entity.images.CarouselImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarouselImagesRepository extends JpaRepository<CarouselImages, Integer> {

    @Query(value = "SELECT DISTINCT c FROM CarouselImages c")
    List<CarouselImages> getAllData();
}
