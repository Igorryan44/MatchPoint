package com.stcakyforge.matchpoint.service;

import com.stcakyforge.matchpoint.dtos.request.CampeonatoRequestDto;
import com.stcakyforge.matchpoint.dtos.response.CampeonatoResponseDto;
import com.stcakyforge.matchpoint.mapper.CampeonatoMapper;
import com.stcakyforge.matchpoint.repository.CampeonatoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoService {

    private  final CampeonatoRepository campeonatoRepository;
    private  final CampeonatoMapper mapper;

    public CampeonatoService(CampeonatoRepository campeonatoRepository, CampeonatoMapper mapper) {
        this.campeonatoRepository = campeonatoRepository;
        this.mapper = mapper;
    }

    public ResponseEntity<CampeonatoResponseDto> criarCampeonato(CampeonatoRequestDto campeonatoRequestDto) {
        return ResponseEntity.ok(mapper.toDto(campeonatoRepository.save(mapper.toEntity(campeonatoRequestDto))));
    }
}
