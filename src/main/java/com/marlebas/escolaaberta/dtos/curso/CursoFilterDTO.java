package com.marlebas.escolaaberta.dtos.curso;

import io.swagger.v3.oas.annotations.media.Schema;

public record CursoFilterDTO(
        @Schema(description = "Nome completo ou parcial do curso", example = "Informatica")
        String nomeCurso) {
}
