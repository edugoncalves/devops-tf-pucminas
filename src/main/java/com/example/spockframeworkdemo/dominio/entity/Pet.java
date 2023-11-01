package com.example.spockframeworkdemo.dominio.entity;



import com.example.spockframeworkdemo.dominio.enumaration.Porte;
import com.example.spockframeworkdemo.dominio.enumaration.Tipo;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "PET")
public class Pet {
    @Id
    @Column(name="id")
    private Integer id;
    private String nome;
    private int idade;
    private String raca;
    private Porte porte;
    private Tipo tipo;

}
