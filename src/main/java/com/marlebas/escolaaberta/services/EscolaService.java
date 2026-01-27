package com.marlebas.escolaaberta.services;

import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.repositories.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {

    private EscolaRepository escolaRepository;

    public EscolaService(EscolaRepository escolaRepository) {
        this.escolaRepository = escolaRepository;
    }

    public List<EscolaResponseDTO>
}
