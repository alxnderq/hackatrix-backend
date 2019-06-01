package com.thot.customermicroservice.client.business;

import com.thot.customermicroservice.client.model.api.get.Students;
import com.thot.customermicroservice.client.model.api.get.Teachers;

public interface UserService {

    Students loginStudent(String code, String pass);

    Teachers loginTeacher(String code, String pass);
}
