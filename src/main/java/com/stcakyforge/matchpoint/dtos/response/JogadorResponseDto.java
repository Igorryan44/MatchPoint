package com.stcakyforge.matchpoint.dtos.response;

import com.stcakyforge.matchpoint.model.Campeonato;
import com.stcakyforge.matchpoint.model.Partida;
import jakarta.persistence.OneToMany;

import java.util.List;

public record JogadorResponseDto(
        Long id,

        String nome,

        int pontos,

        int partidasJogadas,

        int vitorias,

        int empate,

        int derrota,

        int golsMarcados,

        int golsSofridos,

        int saldoGols,

        String time,

        Campeonato campeonato,

        List<Partida> partidasComoJogador1,

        List<Partida> partidasComoJogador2,

        int partidasTotais
) {}
