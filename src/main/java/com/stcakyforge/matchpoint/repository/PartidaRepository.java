package com.stcakyforge.matchpoint.repository;

import com.stcakyforge.matchpoint.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
