package com.stcakyforge.matchpoint.dtos.request;

public record PartidaRequestDto (

        Long idJogador1,
        Long idJogador2,
        Integer golsJogador1,
        Integer golsJogador2,
        Integer cartaoAmareloJogador1,
        Integer cartaoAmareloJogador2
){}