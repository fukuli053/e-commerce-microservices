package com.furkanergun.productservice.DTO;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BrandsAndApparelsDTO implements Serializable {
    List<FilterAttributesDTO> brands;
    List<FilterAttributesDTO> apparels;
}
