package com.thot.customermicroservice.client.model.api.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsGetResponse {

    private Integer id;
    private Integer category;
    private List<Detail> items;
    private List<Option> options;

}
