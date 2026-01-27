package com.marlebas.escolaaberta.services;

import com.marlebas.escolaaberta.dtos.EscolaFilterDTO;
import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.mappers.EscolaMapper;
import com.marlebas.escolaaberta.models.EscolaModel;
import com.marlebas.escolaaberta.repositories.EscolaRepository;
import com.marlebas.escolaaberta.repositories.specs.EscolaSpecs;
import org.springframework.data.jpa.domain.Specification;
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

    public List<EscolaResponseDTO> buscarComFiltro(EscolaFilterDTO filtro){
        Specification<EscolaModel> espc = EscolaSpecs.contemNome(filtro.nome());
                espc = espc.and(EscolaSpecs.bairroIgual(filtro.bairro()));

        return escolaRepository.findAll(espc).stream()
                .map(escolaMapper::map)
                .toList();
    }
}
