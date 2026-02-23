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

    public Campeonato() {
    }

    public Campeonato(Long id, String campNome, int qtdJogadores) {
        this.id = id;
        this.campNome = campNome;
        this.qtdJogadores = qtdJogadores;
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
}
