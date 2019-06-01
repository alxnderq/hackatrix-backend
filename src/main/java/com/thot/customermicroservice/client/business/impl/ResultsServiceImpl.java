package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.ResultsService;
import com.thot.customermicroservice.client.model.api.get.Results;
import com.thot.customermicroservice.client.resources.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultsServiceImpl implements ResultsService {

    @Autowired
    private ResultsRepository resultsRepository;

    @Override
    public List<Results> getResults(Integer idStudent) {
        return resultsRepository.findByIdStudent(idStudent);
    }
}
