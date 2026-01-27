package com.marlebas.escolaaberta.repositories.specs;

import com.marlebas.escolaaberta.models.EscolaModel;
import org.springframework.data.jpa.domain.Specification;

public class EscolaSpecs {

    public static Specification<EscolaModel> contemNome(String nome){
        return (root, query, builder) -> nome == null ? null : builder.like(root.get("nome"), "%" + nome + "%");
    }

    public static Specification<EscolaModel> bairroIgual(String bairro){
        return (root, query, builder) -> bairro == null ? null : builder.like(root.get("bairro"), "%" + bairro + "%");
    }

}
