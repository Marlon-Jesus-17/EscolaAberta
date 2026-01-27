package com.marlebas.escolaaberta.controllers;

import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.services.EscolaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("escolas")
public class EscolaController {

    private EscolaService escolaService;

    public EscolaController(EscolaService escolaService){
        this.escolaService = escolaService;
    }

    @GetMapping("/listar")
    public List<EscolaResponseDTO> listarTudo(){
        return escolaService.listarTudo();
    }

}
