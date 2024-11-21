package com.test.user_management.service.impl;

import com.test.user_management.entity.dto.CommonResponse;
import com.test.user_management.entity.jpa.User;
import com.test.user_management.repo.UserRepository;
import com.test.user_management.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


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
    public CommonResponse getAllUser() {
        List<User> result = userRepository.findAll();
        return CommonResponse.builder().data(result).build();
    }
}
