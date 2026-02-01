package com.marlebas.escolaaberta.mappers;

import com.marlebas.escolaaberta.dtos.CursoResponseDTO;
import com.marlebas.escolaaberta.models.CursoModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mapping(source = "escola.nome", target = "escola")
    @Mapping(source = "escola.inep", target = "inepEscola")
    CursoResponseDTO map(CursoModel cursoModel);

    @Mapping(source = "inepEscola", target = "escola.inep")
    @Mapping(source = "escola", target = "escola.nome")
    CursoModel map(CursoResponseDTO cursoResponseDTO);
}
