package com.marlebas.escolaaberta.services.curso;

import com.marlebas.escolaaberta.dtos.curso.CursoFilterDTO;
import com.marlebas.escolaaberta.dtos.curso.CursoResponseDTO;
import com.marlebas.escolaaberta.mappers.curso.CursoMapper;
import com.marlebas.escolaaberta.models.curso.CursoModel;
import com.marlebas.escolaaberta.repositories.curso.CursoRepository;
import com.marlebas.escolaaberta.repositories.specs.CursoSpec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private CursoRepository cursoRepository;
    private CursoMapper cursoMapper;

    public CursoService(CursoRepository cursoRepository, CursoMapper cursoMapper) {
        this.cursoRepository = cursoRepository;
        this.cursoMapper = cursoMapper;
    }

    public List<CursoResponseDTO> listarTodosCursos(){
        return cursoRepository.findAll().stream()
                .map(cursoMapper::map)
                .toList();
    }

    public List<CursoResponseDTO> buscarComFiltro(CursoFilterDTO filtro){
        Specification<CursoModel> spec = CursoSpec.contemNome(filtro.nomeCurso());

        return cursoRepository.findAll(spec).stream()
                .map(cursoMapper::map)
                .toList();
    }
}
