package com.csbot.admin.csbotadmin.category.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController()
public class CategoryController {

    @PostMapping(value = "/api/categoryList")
    public String callAPI(@RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(body.toString());
        System.out.println(request);
        System.out.println("test");
        return "test";
    }

    @PostMapping("/category")
    public String createCategory(@RequestBody Map<String, Object> params) {
        System.out.println("create category");
        System.out.println(params.toString());
        return "create category";
    }

}
