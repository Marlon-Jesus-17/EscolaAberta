package com.marlebas.escolaaberta.repositories;

import com.marlebas.escolaaberta.models.EscolaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<EscolaModel, Long>, JpaSpecificationExecutor<EscolaModel>{
}
