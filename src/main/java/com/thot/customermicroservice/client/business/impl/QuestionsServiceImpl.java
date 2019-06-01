package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.QuestionsService;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class QuestionsServiceImpl implements QuestionsService {
    @Override
    public List<QuestionsGetResponse> getQuestions(String studentCode, String courseCode) {
        return null;
    }
}
