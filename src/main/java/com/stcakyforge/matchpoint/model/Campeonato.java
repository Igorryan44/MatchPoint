package com.stcakyforge.matchpoint.model;

import com.stcakyforge.matchpoint.enums.CampTypes;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "campeonato")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String campNome;

    private int qtdJogadores;

    private int qtdPartidas;

    private CampTypes estiloPontuacao;

    @OneToMany(mappedBy = "campeonato")
    private List<Partida> partidas;

    @OneToMany(mappedBy = "campeonato")
    private List<Jogador> jogadores;

    public Campeonato() {
    }

    public Campeonato(Long id, String campNome, int qtdJogadores, int qtdPartidas, CampTypes estiloPontuacao, List<Jogador> jogadores, List<Partida> partidas) {
        this.id = id;
        this.campNome = campNome;
        this.qtdJogadores = qtdJogadores;
        this.qtdPartidas = qtdPartidas;
        this.jogadores = jogadores;
        this.partidas = partidas;
        this.estiloPontuacao = estiloPontuacao;
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

    public CampTypes getEstiloPontuacao() {
        return estiloPontuacao;
    }

    public void setEstiloPontuacao(CampTypes estiloPontuacao) {
        this.estiloPontuacao = estiloPontuacao;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }
}
