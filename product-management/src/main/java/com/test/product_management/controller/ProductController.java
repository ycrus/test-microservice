package com.test.product_management.controller;

import com.test.product_management.entity.dto.CommonResponse;
import com.test.product_management.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @GetMapping()
    public CommonResponse getAll() {
        return CommonResponse.builder().data(productService.getAllProduct()).build();
    }
}
