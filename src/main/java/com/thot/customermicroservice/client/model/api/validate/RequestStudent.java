package com.thot.customermicroservice.client.model.api.validate;


public class RequestStudent {

    private Integer category;
    private Integer idQuestion;
    private Integer idAnswerOption;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public Integer getIdAnswerOption() {
        return idAnswerOption;
    }

    public void setIdAnswerOption(Integer idAnswerOption) {
        this.idAnswerOption = idAnswerOption;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

}
