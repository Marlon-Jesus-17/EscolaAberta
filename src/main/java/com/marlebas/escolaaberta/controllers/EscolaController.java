package com.marlebas.escolaaberta.controllers;

import com.marlebas.escolaaberta.dtos.CursoFilterDTO;
import com.marlebas.escolaaberta.dtos.EscolaFilterDTO;
import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.services.EscolaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

    private EscolaService escolaService;

    public EscolaController(EscolaService escolaService){
        this.escolaService = escolaService;
    }

    @GetMapping("/buscar")
    @Operation(summary = "Lista todas as escolas", description = "Retorna uma lista com todas as escolas. Escolas sem cursos vinculados virão com uma lista vázia")
    @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso")
    public List<EscolaResponseDTO> listarEscolas(){
        return escolaService.listarTudo();
    }

    @PostMapping("/buscar/filtro")
    @Operation(summary = "Busca avaçada de escolas", description = "Filtra escolas por nome, bairro ou nome do curso. Retorna uma lista somente com as escolas que possuam cursos vinculados ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Filtros enviados de forma inválida"),
    })
    public List<EscolaResponseDTO> buscar(@RequestBody EscolaFilterDTO filtro){
        return escolaService.buscarComFiltro(filtro);
    }

}
