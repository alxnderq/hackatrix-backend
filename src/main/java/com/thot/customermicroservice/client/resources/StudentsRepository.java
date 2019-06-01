package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {

}
