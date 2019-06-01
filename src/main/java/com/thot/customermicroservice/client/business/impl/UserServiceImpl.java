package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.UserService;
import com.thot.customermicroservice.client.model.api.get.Students;
import com.thot.customermicroservice.client.resources.StudentsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public Students loginStudent(String code, String pass) {
        return studentsRepository.findByCodeAndPassword(code, pass);
    }

}
