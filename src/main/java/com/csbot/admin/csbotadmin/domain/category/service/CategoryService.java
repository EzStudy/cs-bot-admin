package com.csbot.admin.csbotadmin.domain.category.service;

import com.csbot.admin.csbotadmin.domain.category.dto.CategoryListResponseDto;

public interface CategoryService {
    CategoryListResponseDto getCategories(String blockId);
}
