package com.furkanergun.productservice.service.interfaces;


import com.furkanergun.productservice.DTO.ProductInfoDTO;
import com.furkanergun.productservice.entity.info.ProductInfo;
import com.furkanergun.productservice.model.FilterAttributesResponse;
import com.furkanergun.productservice.model.HomeTabsDataResponse;
import com.furkanergun.productservice.model.MainScreenResponse;
import com.furkanergun.productservice.model.SearchSuggestionResponse;

import java.util.HashMap;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

