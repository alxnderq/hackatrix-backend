package com.thot.customermicroservice.expose.web;


import com.thot.customermicroservice.client.business.DashboardService;
import com.thot.customermicroservice.client.model.api.get.Students;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@Api(tags = "Thot")
@RequestMapping("thot/v1/dashboard")
@Slf4j
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping(value = "/getStudents")
    public List<Students> getAllStudents() {
        return dashboardService.getStudents();
    }

}
