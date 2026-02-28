package com.stcakyforge.matchpoint.dtos.request;

import jakarta.validation.constraints.NotBlank;

public record SenhaRequestDto(

        @NotBlank(message = "A senha não pode ser nula")
        String novaSenha
) {}