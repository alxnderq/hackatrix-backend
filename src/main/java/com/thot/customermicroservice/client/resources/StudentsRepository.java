package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

    Students findByCodeAndPassword(String code, String password);
}
