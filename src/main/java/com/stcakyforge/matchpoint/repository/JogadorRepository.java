package com.stcakyforge.matchpoint.repository;

import com.stcakyforge.matchpoint.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
