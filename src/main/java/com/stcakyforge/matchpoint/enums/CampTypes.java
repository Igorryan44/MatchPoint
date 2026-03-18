package com.stcakyforge.matchpoint.enums;

public enum CampTypes {
    DEFAULT("Vitória: 3p, Empate: 1p, Derrota: 0"),
    CUSTOM("Customize as regras de campeonato a seu gosto!");

    private String mensagemTipo;

    CampTypes(String mensagemTipo) {
        this.mensagemTipo = mensagemTipo;
    }
}
