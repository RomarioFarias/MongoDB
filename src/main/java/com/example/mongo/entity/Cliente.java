package com.example.mongo.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document("Cliente")
public class Cliente {

    @Id
    Long id;

    String nome;


}
