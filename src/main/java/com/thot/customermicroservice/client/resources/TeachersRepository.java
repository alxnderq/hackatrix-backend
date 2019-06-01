package com.thot.customermicroservice.client.resources;

import com.thot.customermicroservice.client.model.api.get.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, Long> {

    Teachers findByCodeAndPassword(String code, String password);
}
