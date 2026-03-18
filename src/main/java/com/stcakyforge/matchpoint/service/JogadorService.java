package com.stcakyforge.matchpoint.service;

import com.stcakyforge.matchpoint.dtos.request.JogadorRequestDto;
import com.stcakyforge.matchpoint.dtos.response.JogadorResponseDto;
import com.stcakyforge.matchpoint.mapper.JogadorMapper;
import com.stcakyforge.matchpoint.model.Campeonato;
import com.stcakyforge.matchpoint.model.Jogador;
import com.stcakyforge.matchpoint.repository.CampeonatoRepository;
import com.stcakyforge.matchpoint.repository.JogadorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    private final JogadorRepository jogadorRepository;
    private final CampeonatoRepository campeonatoRepository;
    private final JogadorMapper mapper;

    public JogadorService(JogadorRepository jogadorRepository, JogadorMapper mapper, CampeonatoRepository campeonatoRepository) {
        this.jogadorRepository = jogadorRepository;
        this.mapper = mapper;
        this.campeonatoRepository = campeonatoRepository;
    }

    public ResponseEntity<JogadorResponseDto> criarJogador(JogadorRequestDto request) {
        return ResponseEntity.ok(mapper.toDto(jogadorRepository.save(mapper.toEntity(request))));
    }

    public ResponseEntity<JogadorResponseDto> pegarJogadorPorId(Long id) {
        return ResponseEntity.ok(mapper.toDto(jogadorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Jogador não encontrado!"))));
    }

    public int saldoGols(Long id) {
        Jogador jogador = jogadorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Jogador não encontrado!"));
        int saldoGols = jogador.getGolsMarcados() - jogador.getGolsSofridos();

        jogador.setSaldoGols(saldoGols);
        jogadorRepository.save(jogador);

        return jogador.getSaldoGols();
    }

    public ResponseEntity<List<JogadorResponseDto>> pegarJogadoresPorCampeopnato(Long idCampeonato) throws Throwable {
        if (campeonatoRepository.findById(idCampeonato).isPresent()) {
            Campeonato campeonato = campeonatoRepository.findById(idCampeonato).orElseThrow(() -> new EntityNotFoundException("Campeonato não encontrado!"));

            return ResponseEntity.ok(mapper.toDto(campeonato.getJogadores()));
        }
        return ResponseEntity.notFound().build();
    }

    public void deletarJogador(Long id){
        if(jogadorRepository.findById(id).isPresent()){
            jogadorRepository.deleteById(id);
        }
    }

}
