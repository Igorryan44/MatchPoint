package com.stcakyforge.matchpoint.model;

import jakarta.persistence.*;

@Entity
@Table(name = "campeonato")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String campNome;

    private int qtdJogadores;

    private int qtdPartidas;

    public Campeonato() {
    }

    public Campeonato(Long id, String campNome, int qtdJogadores, int qtdPartidas) {
        this.id = id;
        this.campNome = campNome;
        this.qtdJogadores = qtdJogadores;
        this.qtdPartidas = qtdPartidas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampNome() {
        return campNome;
    }

    public void setCampNome(String campNome) {
        this.campNome = campNome;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public int getQtdPartidas() {
        return qtdPartidas;
    }

    public void setQtdPartidas(int qtdPartidas) {
        this.qtdPartidas = qtdPartidas;
    }
}
