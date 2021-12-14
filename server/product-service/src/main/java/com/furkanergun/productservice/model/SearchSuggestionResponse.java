package com.furkanergun.productservice.model;

import com.furkanergun.productservice.DTO.SearchSuggestionForThreeAttrDTO;
import com.furkanergun.productservice.DTO.SearchSuggestionForTwoAttrDTO;
import com.furkanergun.productservice.entity.category.ApparelCategory;
import com.furkanergun.productservice.entity.category.GenderCategory;
import com.furkanergun.productservice.entity.category.ProductBrandCategory;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SearchSuggestionResponse implements Serializable {
    List<GenderCategory> genderKeywords;
    List<ProductBrandCategory> brandKeywords;
    List<ApparelCategory> apparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderApparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderBrandKeywords;
    List<SearchSuggestionForTwoAttrDTO> apparelBrandKeywords;
    List<SearchSuggestionForThreeAttrDTO> threeAttrKeywords;
    List<String> productKeywords;
}
