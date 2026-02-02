package com.marlebas.escolaaberta.repositories.specs;

import com.marlebas.escolaaberta.models.curso.CursoModel;
import org.springframework.data.jpa.domain.Specification;

public class CursoSpec {
    public static Specification<CursoModel> contemNome(String nome){
        return (root, query, builder)
                -> nome == null ? null : builder.like(root.get("nome"), "%" + nome + "%");
    }
}
