package com.example.mongo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ClienteDto {

    @NotNull
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;


}
