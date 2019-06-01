package com.thot.customermicroservice.expose.web;

import com.thot.customermicroservice.client.business.ResultsService;
import com.thot.customermicroservice.client.model.api.get.Results;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@Api(tags = "Thot")
@RequestMapping("thot/v1/results")
@Slf4j
public class ResultsController {

    @Autowired
    private ResultsService resultsService;

    @GetMapping(name="/")
    public List<Results> getResults(@RequestParam Integer idStudent){
        return resultsService.getResults(idStudent);
    }

}
