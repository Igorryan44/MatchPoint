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

    @OneToMany(mappedBy = "jogador1")
    private List<Partida> partidasComoJogador1;

    @OneToMany(mappedBy = "jogador2")
    private List<Partida> partidasComoJogador2;

    private int partidasTotais;

    public Jogador() {
    }

    public Jogador(Long id, String nome, int pontos, int partidasJogadas, int vitorias, int empate, int derrota, int golsMarcados, int golsSofridos, int saldoGols, List<Partida> partidasComoJogador1, List<Partida> partidasComoJogador2, int partidasTotais) {
        this.id = id;
        this.nome = nome;
        this.pontos = pontos;
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
        this.empate = empate;
        this.derrota = derrota;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
        this.saldoGols = saldoGols;
        this.partidasComoJogador1 = partidasComoJogador1;
        this.partidasComoJogador2 = partidasComoJogador2;
        this.partidasTotais = partidasTotais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public List<Partida> getPartidasComoJogador1() {
        return partidasComoJogador1;
    }

    public void setPartidasComoJogador1(List<Partida> partidasComoJogador1) {
        this.partidasComoJogador1 = partidasComoJogador1;
    }

    public List<Partida> getPartidasComoJogador2() {
        return partidasComoJogador2;
    }

    public void setPartidasComoJogador2(List<Partida> partidasComoJogador2) {
        this.partidasComoJogador2 = partidasComoJogador2;
    }

    public int getPartidasTotais() {
        return partidasTotais;
    }

    public void setPartidasTotais(int partidasTotais) {
        this.partidasTotais = partidasTotais;
    }
}
