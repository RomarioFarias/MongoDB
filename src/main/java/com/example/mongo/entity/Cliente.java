package com.example.mongo.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Document("Cliente")
public class Cliente {

    @MongoId
    @NotNull
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;


}
