package com.marlebas.escolaaberta.services;

import com.marlebas.escolaaberta.dtos.EscolaFilterDTO;
import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.mappers.EscolaMapper;
import com.marlebas.escolaaberta.models.EscolaModel;
import com.marlebas.escolaaberta.repositories.EscolaRepository;
import com.marlebas.escolaaberta.repositories.specs.EscolaSpecs;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EscolaService {

    private EscolaRepository escolaRepository;
    private EscolaMapper escolaMapper;

    public EscolaService(EscolaRepository escolaRepository, EscolaMapper escolaMapper) {
        this.escolaRepository = escolaRepository;
        this.escolaMapper = escolaMapper;
    }

    @Transactional(readOnly = true)
    public List<EscolaResponseDTO> listarTudo() {
        List<EscolaModel> escolas = escolaRepository.findAll();

        return escolas.stream()
                .map(escolaMapper::map)
                .toList();
    }

    public List<?> buscarComFiltro(EscolaFilterDTO filtro){
        Specification<EscolaModel> espc = EscolaSpecs.contemCurso();
                espc = espc.and(EscolaSpecs.contemNome(filtro.nomeEscola()));
                espc = espc.and(EscolaSpecs.nomeCurso(filtro.nomeEscola()));
                espc = espc.and(EscolaSpecs.bairroIgual(filtro.bairro()));

        return escolaRepository.findAll(espc).stream()
                .map(escolaMapper::map)
                .toList();
    }
}
