package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.QuestionsService;
import com.thot.customermicroservice.client.business.processor.QuestionResponseProcessor;
import com.thot.customermicroservice.client.model.api.get.Questions;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import com.thot.customermicroservice.client.model.api.get.Results;
import com.thot.customermicroservice.client.model.api.validate.AnswerValidateRequest;
import com.thot.customermicroservice.client.model.api.validate.RequestStudent;
import com.thot.customermicroservice.client.resources.QuestionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class QuestionsServiceImpl implements QuestionsService {

    private static final Integer CATEGORY_ONE = 1;
    private static final Integer CATEGORY_DOS = 2;

    @Autowired
    private QuestionsRepository questionsRepository;

    @Autowired
    private QuestionResponseProcessor questionResponseProcessor;

    @Override
    public void validate(AnswerValidateRequest answerValidateRequest) {
        List<Results> resultsList = new ArrayList<>();
        for (RequestStudent requestStudent : answerValidateRequest.getRequestStudentList()) {

            Questions questions = questionsRepository.findByIdAndCorrectOption(requestStudent.getIdQuestion(), requestStudent.getIdAnswerOption());

            if (questions != null) {
                Results results = new Results();
                results.setIdStudent(answerValidateRequest.getIdStudent());
                results.setIdCategory(requestStudent.getCategory());
            }
        }

    }

    public List<QuestionsGetResponse> getQuestions(String studentCode, Integer categoryCode) {
        List<Questions> questionsList = questionsRepository.findByIdCategory(categoryCode);
        return questionResponseProcessor.convertQuestions(questionsList);
    }


}
