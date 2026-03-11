package com.stcakyforge.matchpoint.dtos.request;

import jakarta.validation.constraints.NotEmpty;

public record JogadorRequestDto(

        @NotEmpty(message = "O nome do jogador não pode ser branco")
        String name,

        @NotEmpty(message = "O nome do time não pode ser branco")
        String time,

        @NotEmpty(message = "O nome do campeonato não pode ser branco")
        String campeonato
) {}
