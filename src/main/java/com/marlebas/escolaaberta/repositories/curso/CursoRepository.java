package com.marlebas.escolaaberta.repositories.curso;

import com.marlebas.escolaaberta.models.curso.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long>, JpaSpecificationExecutor<CursoModel> {
}
