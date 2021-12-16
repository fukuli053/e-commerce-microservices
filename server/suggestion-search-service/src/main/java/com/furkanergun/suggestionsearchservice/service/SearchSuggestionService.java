package com.furkanergun.suggestionsearchservice.service;

import com.furkanergun.suggestionsearchservice.dto.SearchSuggestionKeywordInfo;

import java.util.List;

public interface SearchSuggestionService {
    void loadSearchSuggestionToMap();

    List<SearchSuggestionKeywordInfo> searchKeywordFromMap(String q);

    List<SearchSuggestionKeywordInfo> getDefaultSearchSuggestions();
}

