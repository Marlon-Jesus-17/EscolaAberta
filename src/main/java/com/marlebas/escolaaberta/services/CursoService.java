package com.marlebas.escolaaberta.services;

import com.marlebas.escolaaberta.dtos.CursoResponseDTO;
import com.marlebas.escolaaberta.mappers.CursoMapper;
import com.marlebas.escolaaberta.repositories.CursoRepository;
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
}
