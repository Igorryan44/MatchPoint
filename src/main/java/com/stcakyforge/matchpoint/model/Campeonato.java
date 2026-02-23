package com.stcakyforge.matchpoint.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "championship")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String campNome;

    private int qtdJogadores;
}
