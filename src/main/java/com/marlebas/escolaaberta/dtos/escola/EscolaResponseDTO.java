package com.marlebas.escolaaberta.dtos.escola;

import com.marlebas.escolaaberta.dtos.curso.CursoResponseDTO;

import java.util.List;

public record EscolaResponseDTO(Long id, String nome, String inep, String endereco, String numero, String complemento, String bairro, String telefone, List<CursoResponseDTO> cursos) {
}
