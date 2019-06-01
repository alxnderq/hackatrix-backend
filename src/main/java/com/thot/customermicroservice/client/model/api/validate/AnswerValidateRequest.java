package com.thot.customermicroservice.client.model.api.validate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnswerValidateRequest {

    private String category;
    private Integer idQuestion;
    private String idAnswerOption;
}
