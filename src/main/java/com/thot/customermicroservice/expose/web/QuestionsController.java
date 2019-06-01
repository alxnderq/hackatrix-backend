package com.thot.customermicroservice.expose.web;

import com.thot.customermicroservice.client.business.QuestionsService;
import com.thot.customermicroservice.client.model.api.get.QuestionsGetResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController
@Api(tags = "Thot")
@RequestMapping("thot/v1")
@Slf4j
public class QuestionsController {

    QuestionsService questionsService;

    public QuestionsController(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    /**
     * Endpoint que permite obtener las preguntas para el alumno
     *
     * @return Service Response ({@link QuestionsGetResponse})
     */
    @GetMapping(value = "/getQuestions", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Lista de clientes con su fecha probable de muerte",
            produces = MediaType.APPLICATION_JSON_VALUE,
            response = QuestionsGetResponse.class,
            httpMethod = "GET"
    )
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "Obtuvo los datos correctos."
            ),
            @ApiResponse(
                    code = 404,
                    message = "No se encontro el recurso solicitado."
            ),
            @ApiResponse(
                    code = 500,
                    message = "Error al obtener los datos."
            ),
            @ApiResponse(
                    code = 503,
                    message = "El servicio no se encuentra disponible."
            )
    })
    @ResponseStatus(HttpStatus.OK)
    public List<QuestionsGetResponse> getQuestions(@RequestParam String studentCode,@RequestParam String courseCode) {
        return questionsService.getQuestions(studentCode,courseCode);
    }
}
