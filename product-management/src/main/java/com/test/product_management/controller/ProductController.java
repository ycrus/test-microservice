package com.test.product_management.controller;

import com.test.product_management.entity.dto.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {


    @GetMapping()
    public CommonResponse getAll() {
        return CommonResponse.builder().build();
    }
}
