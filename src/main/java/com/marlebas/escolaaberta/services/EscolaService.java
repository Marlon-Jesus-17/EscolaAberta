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

        // Verificação no console
        for (EscolaModel escola : escolas) {
            System.out.println("Escola: " + escola.getNome() + " | Qtd Cursos: " + escola.getCursos().size());
        }

        return escolas.stream()
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
