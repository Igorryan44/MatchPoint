package com.stcakyforge.matchpoint.repository;

import com.stcakyforge.matchpoint.model.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeonatoRepository extends JpaRepository<Campeonato,Long> {
}
