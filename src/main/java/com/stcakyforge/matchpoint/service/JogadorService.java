package com.stcakyforge.matchpoint.service;

import com.stcakyforge.matchpoint.repository.JogadorRepository;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }
}
