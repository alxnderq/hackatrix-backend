package com.thot.customermicroservice.client.model.api.validate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerValidateRequest {

    private Integer idStudent;
    private List<RequestStudent> requestStudentList;

}
