package com.example.spockframeworkdemo.dominio.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tipo {
    CACHORRO(0,"Cachorro"),
    GATO(1,"Gato");

    private int id;
    private String descricao;
}
