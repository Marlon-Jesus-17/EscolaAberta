package com.marlebas.escolaaberta.dtos;

import java.util.List;

public record EscolaResponseDTO(Long id, String nome, String inep, String endereco, String numero, String complemento, String bairro, String telefone, List<CursoResponseDTO> cursos) {
}
