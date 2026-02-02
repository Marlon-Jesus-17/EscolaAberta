package com.marlebas.escolaaberta.mappers.curso;

import com.marlebas.escolaaberta.dtos.curso.CursoResponseDTO;
import com.marlebas.escolaaberta.models.curso.CursoModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mapping(source = "escola.nome", target = "escola")
    @Mapping(source = "escola.inep", target = "inepEscola")
    @Mapping(source = "nome", target = "nomeCurso")
    CursoResponseDTO map(CursoModel cursoModel);

    @Mapping(source = "inepEscola", target = "escola.inep")
    @Mapping(source = "escola", target = "escola.nome")
    @Mapping(source = "nomeCurso", target = "nome")
    CursoModel map(CursoResponseDTO cursoResponseDTO);
}
