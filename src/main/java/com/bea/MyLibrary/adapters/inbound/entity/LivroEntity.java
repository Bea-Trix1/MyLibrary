package com.bea.MyLibrary.adapters.inbound.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class LivroEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    private String nome;

    private LocalDate dataPublicacao;

    private Double valor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nome")
    private LivroEntity livro;
}
