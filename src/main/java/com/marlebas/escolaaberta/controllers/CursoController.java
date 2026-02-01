package com.marlebas.escolaaberta.controllers;

import com.marlebas.escolaaberta.dtos.CursoResponseDTO;
import com.marlebas.escolaaberta.services.CursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/listar")
    public List<CursoResponseDTO> listarCursos(){
        return cursoService.listarTodosCursos();
    }

}
