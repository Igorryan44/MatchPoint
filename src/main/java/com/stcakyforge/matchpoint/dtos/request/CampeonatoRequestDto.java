package com.stcakyforge.matchpoint.dtos.request;

import com.stcakyforge.matchpoint.enums.CampTypes;
import com.stcakyforge.matchpoint.model.Jogador;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record CampeonatoRequestDto(

        @NotBlank(message = "O nome do campeonato não pode estar em branco")
        String nomeCampeonato,

        List<Jogador> jogadores,

        @NotBlank(message = "A data de início do campeonato não pode estar em branco")
        LocalDateTime dataInicio,

        @NotBlank(message = "A data de início do campeonato não pode estar em branco")
        LocalDateTime dataFim,

        @NotBlank(message = "O estilo de pontuação deve ser selecionado")
        CampTypes estiloPontuacao
) {}