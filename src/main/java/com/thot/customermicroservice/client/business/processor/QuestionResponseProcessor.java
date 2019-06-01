package com.thot.customermicroservice.client.business.processor;

import com.thot.customermicroservice.client.model.api.get.Detail;
import com.thot.customermicroservice.client.model.api.get.Option;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class QuestionResponseProcessor {

    public List<QuestionsGetResponse> processorResponse(String studentCode, String courseCode) {
        List<QuestionsGetResponse> questionsGetResponses = new ArrayList<>();
        QuestionsGetResponse questionsGetResponse = new QuestionsGetResponse();
        List<Detail> items = new ArrayList<>();
        Detail detail = new Detail();
        detail.setType("text");
        detail.setData("Cuantos departamentos tuvieron con poca presencia incaica");
        items.add(detail);

        List<Option> options = new ArrayList<>();
        Option option = new Option();
        option.setOptionId(1);
        option.setOptionDescription("3 departamentos");
        options.add(option);

        questionsGetResponse.setCategory("espacial");
        questionsGetResponse.setId(Integer.parseInt(studentCode));
        questionsGetResponse.setItems(items);
        questionsGetResponse.setOptions(options);
        questionsGetResponses.add(questionsGetResponse);

        return questionsGetResponses;

    }
}
