package com.thot.customermicroservice.client.business.impl;

import com.thot.customermicroservice.client.business.QuestionsService;
import com.thot.customermicroservice.client.business.processor.QuestionResponseProcessor;
import com.thot.customermicroservice.client.model.api.get.Questions;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import com.thot.customermicroservice.client.model.api.get.Results;
import com.thot.customermicroservice.client.model.api.validate.AnswerValidateRequest;
import com.thot.customermicroservice.client.model.api.validate.RequestStudent;
import com.thot.customermicroservice.client.resources.QuestionsRepository;
import com.thot.customermicroservice.client.resources.ResutlsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private ResutlsRepository resutlsRepository;

    @Override
    public void validate(AnswerValidateRequest answerValidateRequest) {
        int averageCategoryA = 0;
        int averageCategoryB = 0;
        answerValidateRequest.getRequestStudentList().size();
        for (RequestStudent requestStudent : answerValidateRequest.getRequestStudentList()) {
            Questions questions = questionsRepository.findByIdAndCorrectOption(requestStudent.getIdQuestion(), requestStudent.getIdAnswerOption());
            if (questions != null) {
                if (CATEGORY_ONE == requestStudent.getCategory()) {
                    averageCategoryA++;
                } else {
                    averageCategoryB++;
                }
            }
        }
        Results result = new Results();
        result.setIdCategory(1);
        result.setIdStudent(answerValidateRequest.getIdStudent());
        result.setAverage(averageCategoryA*4);
        resutlsRepository.save(result);

        Results result2 = new Results();
        result2.setIdCategory(1);
        result2.setIdStudent(answerValidateRequest.getIdStudent());
        result2.setAverage(averageCategoryB*4);
        resutlsRepository.save(result2);


    }

    public List<QuestionsGetResponse> getQuestions(String studentCode, Integer categoryCode) {
        List<Questions> questionsList = questionsRepository.findByIdCategory(categoryCode);
        return questionResponseProcessor.convertQuestions(questionsList);
    }


}
