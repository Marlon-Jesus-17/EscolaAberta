package com.marlebas.escolaaberta.repositories;

import com.marlebas.escolaaberta.models.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
}
