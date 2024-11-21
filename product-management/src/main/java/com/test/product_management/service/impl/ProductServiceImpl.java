package com.test.product_management.service.impl;

import com.test.product_management.entity.dto.CommonResponse;
import com.test.product_management.entity.jpa.Product;
import com.test.product_management.repo.ProductRepository;
import com.test.product_management.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


//    @Override
//    public CommonResponse getDivision() {
//        List<Division> result = divisionRepo.findAllByIsActiveIsTrue();
//        List<ListId> finalResult = new ArrayList<>();
//        if(!result.isEmpty()){
//            result.forEach(a->{
//                ListId data = new ListId();
//                data.setId(a.getId());
//                data.setName(a.getName());
//                finalResult.add(data);
//            });
//        }
//        return CommonResponse.builder().data(finalResult).build();
//    }

    @Override
    public CommonResponse getAllProduct() {
        List<Product> result = productRepository.findAll();
        return CommonResponse.builder().data(result).build();
    }
}
