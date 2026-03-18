package com.stcakyforge.matchpoint.dtos.response;

import com.stcakyforge.matchpoint.enums.CampTypes;
import com.stcakyforge.matchpoint.model.Jogador;

import java.time.LocalDateTime;
import java.util.List;

public record CampeonatoResponseDto(
        String nomeCampeonato,
        List<Jogador> jogadores,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        CampTypes estiloPontuacao
) {}