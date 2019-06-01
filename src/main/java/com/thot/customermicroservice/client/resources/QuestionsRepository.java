package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Questions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository {

    List<Questions> findByIdCategory(String category);

    Questions findByIdAndCorrectOption(Integer id, Integer option);
}
