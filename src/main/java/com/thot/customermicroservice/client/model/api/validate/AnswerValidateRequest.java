package com.thot.customermicroservice.client.model.api.validate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


public class AnswerValidateRequest {

    private Integer idStudent;
    private List<RequestStudent> requestStudentList;

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public List<RequestStudent> getRequestStudentList() {
        return requestStudentList;
    }

    public void setRequestStudentList(List<RequestStudent> requestStudentList) {
        this.requestStudentList = requestStudentList;
    }
}
