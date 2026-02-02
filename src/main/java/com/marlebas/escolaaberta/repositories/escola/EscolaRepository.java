package com.marlebas.escolaaberta.repositories.escola;

import com.marlebas.escolaaberta.models.escola.EscolaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<EscolaModel, Long>, JpaSpecificationExecutor<EscolaModel>{
}
