package com.thot.customermicroservice.client.model.api.get;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "questions", schema = "thot")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Integer id;

    @Column(name = "id_category")
    private Integer idCategory;

    @Column(name = "correct_option")
    private Integer correctOption;

    @Column(name = "status")
    private String status;

    @Column(name = "items")
    private String items;

    @Column(name = "answers")
    private String options;



}
