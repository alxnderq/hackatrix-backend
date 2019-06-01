package com.thot.customermicroservice.client.business;

import com.thot.customermicroservice.client.model.api.get.Results;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResultsService {

    List<Results> getResults(Integer idStudent);

}
