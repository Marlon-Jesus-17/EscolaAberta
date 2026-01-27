package com.marlebas.escolaaberta.services;

import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.mappers.EscolaMapper;
import com.marlebas.escolaaberta.repositories.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {

    private EscolaRepository escolaRepository;
    private EscolaMapper escolaMapper;

    public EscolaService(EscolaRepository escolaRepository, EscolaMapper escolaMapper) {
        this.escolaRepository = escolaRepository;
        this.escolaMapper = escolaMapper;
    }

    public List<EscolaResponseDTO> listarTudo(){
        return escolaRepository.findAll().stream()
                .map(escolaMapper::map)
                .toList();
    }
}
