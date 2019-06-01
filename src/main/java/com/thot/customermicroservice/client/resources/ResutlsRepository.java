package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Results;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResutlsRepository  extends CrudRepository<Results, Integer> {


}
