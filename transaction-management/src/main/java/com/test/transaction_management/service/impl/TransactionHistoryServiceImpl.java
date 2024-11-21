package com.test.transaction_management.service.impl;

import com.test.transaction_management.entity.dto.CommonResponse;
import com.test.transaction_management.entity.jpa.TransactionHistory;
import com.test.transaction_management.repo.TransactionHistoryRepository;
import com.test.transaction_management.service.TransactionHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionHistoryServiceImpl implements TransactionHistoryService {

    private final TransactionHistoryRepository userRepository;


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
    public CommonResponse getAllTransaction() {
        List<TransactionHistory> result = userRepository.findAll();
        return CommonResponse.builder().data(result).build();
    }
}
