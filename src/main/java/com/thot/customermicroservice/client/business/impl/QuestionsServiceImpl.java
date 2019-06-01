package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.QuestionsService;
import com.thot.customermicroservice.client.business.processor.QuestionResponseProcessor;
import com.thot.customermicroservice.client.model.api.get.Questions;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import com.thot.customermicroservice.client.model.api.validate.AnswerValidateRequest;
import com.thot.customermicroservice.client.resources.QuestionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    @Autowired
    private QuestionResponseProcessor questionResponseProcessor;

    @Override
    public List<QuestionsGetResponse> getQuestions(String studentCode, Integer categoryCode) {
        List<Questions> questionsList = questionsRepository.findByIdCategory(categoryCode);
        return questionResponseProcessor.convertQuestions(questionsList);
        //return questionResponseProcessor.processorResponse(studentCode, categoryCode);
    }

    @Override
    public Integer validate(List<AnswerValidateRequest> request) {
        //recorrer la lista
        return 20;
    }
}
