package com.stcakyforge.matchpoint.dtos.request;

import jakarta.validation.constraints.NotEmpty;

public record UsuarioRequestDto(
        @NotEmpty(message = "O usuário não pode ser nulo")
        String username,

        @NotEmpty(message = "O email não pode ser nulo")
        String email,

        @NotEmpty(message = "A senha não pode ser nula")
        String senha
) {}