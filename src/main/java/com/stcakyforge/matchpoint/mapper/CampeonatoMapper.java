package com.stcakyforge.matchpoint.mapper;

import com.stcakyforge.matchpoint.dtos.request.CampeonatoRequestDto;
import com.stcakyforge.matchpoint.dtos.response.CampeonatoResponseDto;
import com.stcakyforge.matchpoint.model.Campeonato;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CampeonatoMapper {
    CampeonatoResponseDto toDto(Campeonato campeonato);

    List<CampeonatoResponseDto> toDto (List<Campeonato> campeonatos);

    Campeonato toEntity(CampeonatoRequestDto campeonatoRequest);
}