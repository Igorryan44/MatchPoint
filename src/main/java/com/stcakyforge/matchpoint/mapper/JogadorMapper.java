package com.stcakyforge.matchpoint.mapper;

import com.stcakyforge.matchpoint.dtos.request.JogadorRequestDto;
import com.stcakyforge.matchpoint.dtos.response.JogadorResponseDto;
import com.stcakyforge.matchpoint.model.Jogador;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JogadorMapper {

    JogadorResponseDto toDto(Jogador jogador);

    List<JogadorResponseDto> toDto (List<Jogador> jogadors);

    Jogador toEntity(JogadorRequestDto jogadorRequest);
}