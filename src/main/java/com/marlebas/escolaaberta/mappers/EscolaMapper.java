package com.marlebas.escolaaberta.mappers;

import com.marlebas.escolaaberta.dtos.EscolaResponseDTO;
import com.marlebas.escolaaberta.models.EscolaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CursoMapper.class})
public interface EscolaMapper {

    EscolaResponseDTO map(EscolaModel escolaModel);

    EscolaModel map(EscolaResponseDTO escolaResponseDTO);

}
