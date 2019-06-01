package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.DashboardService;
import com.thot.customermicroservice.client.business.QuestionsService;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import com.thot.customermicroservice.client.model.api.get.Students;
import com.thot.customermicroservice.client.resources.StudentsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public List<Students> getStudents() {
        return studentsRepository.findAll();
    }
}
