package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Results;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultsRepository extends CrudRepository<Results, Integer> {

    List<Results> findByIdStudent(Integer idStudent);
}
