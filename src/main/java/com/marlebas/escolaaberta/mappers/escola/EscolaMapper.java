package com.marlebas.escolaaberta.mappers.escola;

import com.marlebas.escolaaberta.dtos.escola.EscolaResponseDTO;
import com.marlebas.escolaaberta.mappers.curso.CursoMapper;
import com.marlebas.escolaaberta.models.escola.EscolaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CursoMapper.class})
public interface EscolaMapper {

    EscolaResponseDTO map(EscolaModel escolaModel);

    EscolaModel map(EscolaResponseDTO escolaResponseDTO);

}
