package com.monsha.estore.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "product_methods")
@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String getAllProducts() {
        // Логика получения всех продуктов
        return "All products retrieved";
    }
}
