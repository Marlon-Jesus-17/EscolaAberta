package com.marlebas.escolaaberta.dtos.escola;

import io.swagger.v3.oas.annotations.media.Schema;

public record EscolaFilterDTO(
        @Schema(description = "Nome completo ou parcial da escola", example = "Escola Estadual Central")
        String nomeEscola,

        @Schema(description = "Bairro onde a escola está localizada", example = "Centro")
        String bairro,

        @Schema(description = "Buscar escolas por um cursos específico", example = "enfermagem")
        String nomeCurso) {
}
