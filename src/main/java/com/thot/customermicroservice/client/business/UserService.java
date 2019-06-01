package com.thot.customermicroservice.client.business;

import com.thot.customermicroservice.client.model.api.get.Students;

public interface UserService {

    Students loginStudent(String code, String pass);
}
