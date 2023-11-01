package com.example.spockframeworkdemo.dominio.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Porte {
    PEQUENO(0,"Pequeno porte"),
    MEDIO(1,"Médio porte"),
    GRANDE(2,"Grande porte");

    private int id;
    private String descricao;
}
