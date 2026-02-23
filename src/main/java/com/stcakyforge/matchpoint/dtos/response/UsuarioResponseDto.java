package com.stcakyforge.matchpoint.dtos.response;

public record UsuarioResponseDto (
        Long id,

        String username,

        String email,

        String senha
){}