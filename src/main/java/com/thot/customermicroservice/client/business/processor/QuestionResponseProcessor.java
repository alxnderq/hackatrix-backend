package com.thot.customermicroservice.client.business.processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.thot.customermicroservice.client.model.api.get.Detail;
import com.thot.customermicroservice.client.model.api.get.Option;
import com.thot.customermicroservice.client.model.api.get.Questions;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import com.thot.customermicroservice.client.model.api.validate.AnswerValidateRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class QuestionResponseProcessor {

    public Integer validate(AnswerValidateRequest answerValidateRequest) {
        return 20;
    }

    public Option convertOption(String jsonOption) {
        Option option = new Gson().fromJson(jsonOption, Option.class);
        return option;
    }

    public List<QuestionsGetResponse> convertQuestions(List<Questions> questionsList) {
        List<QuestionsGetResponse> questionsGetResponseList = new ArrayList<>();

        questionsList.forEach(question -> {
            QuestionsGetResponse questionsGetResponse = new QuestionsGetResponse();
            questionsGetResponse.setId(question.getId());
            questionsGetResponse.setCategory(question.getIdCategory());
            questionsGetResponse.setItems(convertItems(question.getItems()));
            questionsGetResponse.setOptions(convertOptions(question.getOptions()));
            questionsGetResponseList.add(questionsGetResponse);
        });
        return questionsGetResponseList;
    }

    public List<Detail> convertItems(String jsonOption) {
        List<Detail> details = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        // 1. convert JSON array to Array objects
        try {
            Detail[] pp1 = mapper.readValue(jsonOption, Detail[].class);
            // 2. convert JSON array to List of objects
            details = Arrays.asList(mapper.readValue(jsonOption, Detail[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return details;
    }

    public List<Option> convertOptions(String jsonOption) {
        List<Option> optionList = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        // 1. convert JSON array to Array objects
        try {
            Option[] pp1 = mapper.readValue(jsonOption, Option[].class);
            // 2. convert JSON array to List of objects
            optionList = Arrays.asList(mapper.readValue(jsonOption, Option[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return optionList;
    }

}
