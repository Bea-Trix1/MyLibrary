package com.bea.MyLibrary.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Livro implements Serializable {

    private Long id;

    private String nome;

    private LocalDate dataPublicacao;

    private Double valor;


    public Livro() {
    }
}
