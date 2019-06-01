package com.thot.customermicroservice.client.model.api.validate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestStudent {

    private Integer category;
    private Integer idQuestion;
    private Integer idAnswerOption;

}
