package com.furkanergun.productservice.model;

import com.furkanergun.productservice.DTO.ApparelImagesDTO;
import com.furkanergun.productservice.DTO.BrandImagesDTO;
import com.furkanergun.productservice.entity.images.CarouselImages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MainScreenResponse implements Serializable {

    private List<BrandImagesDTO> brands;
    private List<ApparelImagesDTO> apparels;
    private List<CarouselImages> carousels;

    public MainScreenResponse(List<BrandImagesDTO> brands,
                              List<ApparelImagesDTO> apparels,
                              List<CarouselImages> carousels) {
        this.brands = brands;
        this.apparels = apparels;
        this.carousels = carousels;
    }
}
