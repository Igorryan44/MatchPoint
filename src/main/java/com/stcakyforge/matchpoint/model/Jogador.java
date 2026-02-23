package com.stcakyforge.matchpoint.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int pontos;

    private int partidasJogadas;

    private int vitorias;

    private int empate;

    private int derrota;

    private int golsMarcados;

    private int golsSofridos;

    private int saldoGols;

    private List<Object> ultimasPartidas;
}
