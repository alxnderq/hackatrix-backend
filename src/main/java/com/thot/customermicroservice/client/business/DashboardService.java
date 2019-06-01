package com.thot.customermicroservice.client.business;

import com.thot.customermicroservice.client.model.api.get.Students;

import java.util.List;

public interface DashboardService {

    List<Students> getStudents();
}
