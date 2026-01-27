package com.marlebas.escolaaberta.repositories;

import com.marlebas.escolaaberta.models.ProjetoSocialModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoSocialRepository extends JpaRepository<ProjetoSocialModel, Long> {
}
