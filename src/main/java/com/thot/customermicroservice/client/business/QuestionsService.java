package com.thot.customermicroservice.client.business;

import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import com.thot.customermicroservice.client.model.api.validate.AnswerValidateRequest;

import java.util.List;

public interface QuestionsService {

    List<QuestionsGetResponse> getQuestions(String studentCode, Integer categoryCode);

    Integer validate(List<AnswerValidateRequest> request);
}
