package com.stcakyforge.matchpoint.mapper;

import com.stcakyforge.matchpoint.dtos.request.UsuarioRequestDto;
import com.stcakyforge.matchpoint.dtos.response.UsuarioResponseDto;
import com.stcakyforge.matchpoint.model.Usuario;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UsuarioMapper {

    UsuarioResponseDto toDto(Usuario usuario);

    List<UsuarioResponseDto> toDto (List<Usuario> usuarios);

    Usuario toEntity(Optional<UsuarioRequestDto> usuarioRequest);

    Usuario toEntity(UsuarioRequestDto usuarioRequest);
}
