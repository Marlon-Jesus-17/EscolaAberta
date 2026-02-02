package com.marlebas.escolaaberta.controllers;

import com.marlebas.escolaaberta.dtos.CursoResponseDTO;
import com.marlebas.escolaaberta.services.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @GetMapping("/buscar")
    @Operation(summary = "Lista todos os cursos", description = "Retorna uma lista simplificada de todos os cursos para navegação rápida")
    @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso")
    public List<CursoResponseDTO> listarCursos(){
        return cursoService.listarTodosCursos();
    }

}
