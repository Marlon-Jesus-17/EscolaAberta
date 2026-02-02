package com.marlebas.escolaaberta.services.escola;

import com.marlebas.escolaaberta.dtos.escola.EscolaFilterDTO;
import com.marlebas.escolaaberta.dtos.escola.EscolaResponseDTO;
import com.marlebas.escolaaberta.mappers.escola.EscolaMapper;
import com.marlebas.escolaaberta.models.escola.EscolaModel;
import com.marlebas.escolaaberta.repositories.escola.EscolaRepository;
import com.marlebas.escolaaberta.repositories.specs.EscolaSpec;
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

    public List<EscolaResponseDTO> buscarComFiltro(EscolaFilterDTO filtro){
        Specification<EscolaModel> espc = EscolaSpec.contemCurso();
                espc = espc.and(EscolaSpec.contemNome(filtro.nomeEscola()));
                espc = espc.and(EscolaSpec.nomeCurso(filtro.nomeCurso()));
                espc = espc.and(EscolaSpec.bairroIgual(filtro.bairro()));

        return escolaRepository.findAll(espc).stream()
                .map(escolaMapper::map)
                .toList();
    }
}
