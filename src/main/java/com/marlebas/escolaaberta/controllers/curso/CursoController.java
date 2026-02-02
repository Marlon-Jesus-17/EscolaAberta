package com.marlebas.escolaaberta.controllers.curso;

import com.marlebas.escolaaberta.dtos.curso.CursoFilterDTO;
import com.marlebas.escolaaberta.dtos.curso.CursoResponseDTO;
import com.marlebas.escolaaberta.services.curso.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/buscar/filtro")
    @Operation(summary = "Busca avançada de cursos", description = "Filtra cursos por nome. Retorna uma lista somente dos cursos para uma navegação mais limpa")
    @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso")
    public List<CursoResponseDTO> buscarComFiltro(@RequestBody CursoFilterDTO filtro){
        return cursoService.buscarComFiltro(filtro);
    }

}
