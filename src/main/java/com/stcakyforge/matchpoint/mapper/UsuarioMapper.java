package com.stcakyforge.matchpoint.mapper;

import com.stcakyforge.matchpoint.dtos.request.UsuarioRequestDto;
import com.stcakyforge.matchpoint.dtos.response.UsuarioResponseDto;
import com.stcakyforge.matchpoint.model.Usuario;

public class UsuarioMapper {

    UsuarioResponseDto toDto(Usuario usuario) {

        return new UsuarioResponseDto(
            usuario.getId(),
            usuario.getUsername(),
            usuario.getEmail(),
            usuario.getSenha()
        );
    }
}
