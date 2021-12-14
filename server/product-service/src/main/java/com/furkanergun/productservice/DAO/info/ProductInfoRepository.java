package com.furkanergun.productservice.DAO.info;

import com.furkanergun.productservice.DTO.*;
import com.furkanergun.productservice.entity.info.ProductInfo;
import com.furkanergun.productservice.model.FilterAttributesResponse;
import com.furkanergun.productservice.model.HomeTabsDataResponse;

import org.javatuples.Pair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.HashMap;
import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {

    Pair<Long, List<ProductInfo>> getProductsByCategories(HashMap<String, String> conditionMap);

    List<ProductInfo> getProductsById(String[] productIds);

    FilterAttributesResponse getFilterAttributesByProducts(HashMap<String, String> conditionMap);

    HomeTabsDataResponse getBrandsAndApparelsByGender();

    List<SearchSuggestionForThreeAttrDTO> getGenderApparelBrandByIdAndName();

    List<SearchSuggestionForTwoAttrDTO> getGenderAndApparelByIdAndName();

    List<SearchSuggestionForTwoAttrDTO> getGenderAndBrandByIdAndName();

    List<SearchSuggestionForTwoAttrDTO> getApparelAndBrandByIdAndName();

    @Query(value = "SELECT DISTINCT p.name FROM ProductInfo p")
    List<String> getProductByName();
}
