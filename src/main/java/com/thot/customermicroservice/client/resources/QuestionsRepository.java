package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {

    List<Questions> findByIdCategory(Integer idCategory);

    Questions findByIdAndCorrectOption(Integer id, Integer option);
}
