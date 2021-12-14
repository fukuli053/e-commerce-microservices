package com.furkanergun.productservice.controller;

import com.furkanergun.productservice.DTO.ProductInfoDTO;
import com.furkanergun.productservice.entity.info.ProductInfo;
import com.furkanergun.productservice.model.*;
import com.furkanergun.productservice.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Objects;

@RestController
public class ProductController {

    @Autowired
    Environment environment;

    @Autowired
    CommonDataService productService;

    @Autowired
    LoadFakeDataService loadFakeDataService;

    public void fillWithTestData() {
        if (Objects.equals(environment.getProperty("ACTIVE_PROFILE"), "dev")) {
            loadFakeDataService.loadTestData();
        }
    }

    @GetMapping(value = "/products", params = "q")
    public ResponseEntity<?> getProductsByCategories(@RequestParam("q") String queryParams) {

        ProductInfoDTO productInfoDTO = productService.getProductsByCategories(queryParams);

        if (productInfoDTO == null) {
            return ResponseEntity.badRequest().body("Query has not followed the required format.");
        }

        return ResponseEntity.ok(productInfoDTO);
    }

    @GetMapping(value = "/products", params = "product_id")
    public ResponseEntity<?> getProductsById(@RequestParam("product_id") String queryParams) {

        HashMap<Integer, ProductInfo> resultMap = productService.getProductsById(queryParams);

        if (resultMap == null) {
            return ResponseEntity.badRequest().body("Query has not followed the required format.");
        }

        return ResponseEntity.ok(resultMap);
    }

    @GetMapping("/home")
    public ResponseEntity<?> getMainScreenData() {
        MainScreenResponse mainScreenInfoList = productService.getHomeScreenData("homeAPI");
        if (mainScreenInfoList == null) {
            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
        }

        return ResponseEntity.ok(mainScreenInfoList);
    }

    @GetMapping("/tabs")
    public ResponseEntity<?> getHomeTabsDataResponse() {
        HomeTabsDataResponse homeTabsDataResponse = productService.getBrandsAndApparelsByGender("tabsAPI");
        if (homeTabsDataResponse == null) {
            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
        }

        return ResponseEntity.ok(homeTabsDataResponse);
    }

    @GetMapping(value = "/filter", params = "q")
    public ResponseEntity<?> getFilterAttributesByProducts(@RequestParam("q") String queryParams) {

        // TODO: Ürün adına göre filtre.
        String[] splitParams = queryParams.split("=");
        if(splitParams.length >= 1 && splitParams[0].equals("productname")){
            queryParams="category=all";
        }

        FilterAttributesResponse result = productService.getFilterAttributesByProducts(queryParams);

        if (result == null) {
            return ResponseEntity.badRequest().body("Query has not followed the required format.");
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/search-suggestion-list")
    public ResponseEntity<?> getSearchSuggestionList() {
        SearchSuggestionResponse searchSuggestionList = productService.getSearchSuggestionList();
        if (searchSuggestionList == null) {
            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
        }

        return ResponseEntity.ok(searchSuggestionList);
    }
}
