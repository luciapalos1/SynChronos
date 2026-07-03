package com.SynChronos.features.agenda.repository;

import com.SynChronos.features.agenda.model.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<AgendaEntity,Long> {
}
