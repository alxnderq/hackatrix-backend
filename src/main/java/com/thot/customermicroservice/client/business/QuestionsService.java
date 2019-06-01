package com.thot.customermicroservice.client.business;

import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;

import java.util.List;

public interface QuestionsService {

    List<QuestionsGetResponse> getQuestions(String studentCode, String courseCode);
}
