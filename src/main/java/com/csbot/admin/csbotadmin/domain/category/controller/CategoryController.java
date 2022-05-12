package com.csbot.admin.csbotadmin.domain.category.controller;

import com.csbot.admin.csbotadmin.domain.category.dto.CategoryListResponseDto;
import com.csbot.admin.csbotadmin.domain.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping(value = "/categoryList")
    public CategoryListResponseDto callAPI(@RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(body.toString());
        System.out.println(request);
        System.out.println("test");

        Map<String, Object> userRequest = (Map<String, Object>) body.get("userRequest");
        Map<String, Object> block = (Map<String, Object>)userRequest.get("block");
        String blockId = block.get("id").toString();

        return categoryService.getCategories(blockId);
    }

    @PostMapping("/category")
    public String createCategory(@RequestBody Map<String, Object> params) {
        System.out.println("create category");
        System.out.println(params.toString());
        return "create category";
    }

}
