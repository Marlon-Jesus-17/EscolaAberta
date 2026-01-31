package com.marlebas.escolaaberta.controllers;

import com.marlebas.escolaaberta.dtos.CursoFilterDTO;
import com.marlebas.escolaaberta.dtos.EscolaFilterDTO;
import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.services.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

    private EscolaService escolaService;

    public EscolaController(EscolaService escolaService){
        this.escolaService = escolaService;
    }

    @GetMapping("/listar")
    public List<EscolaResponseDTO> listarEscolas(){
        return escolaService.listarTudo();
    }

    @PostMapping("/buscar")
    public List<?> buscar(@RequestBody EscolaFilterDTO filtro){
        return escolaService.buscarComFiltro(filtro);
    }

}
