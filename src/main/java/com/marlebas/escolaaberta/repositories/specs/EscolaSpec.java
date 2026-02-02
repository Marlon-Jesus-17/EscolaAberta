package com.marlebas.escolaaberta.repositories.specs;

import com.marlebas.escolaaberta.models.escola.EscolaModel;
import org.springframework.data.jpa.domain.Specification;

public class EscolaSpec {

    public static Specification<EscolaModel> contemNome(String nome){
        return (root, query, builder)
                -> nome == null ? null : builder.like(root.get("nome"), "%" + nome + "%");
    }

    public static Specification<EscolaModel> bairroIgual(String bairro){
        return (root, query, builder)
                -> bairro == null ? null : builder.like(root.get("bairro"), "%" + bairro + "%");
    }

    public static Specification<EscolaModel> nomeCurso(String nomeCurso){
        return (root, query, builder)
                ->{ query.distinct(true);
            return nomeCurso == null ? null : builder.like(root.join("cursos").get("nome"), "%" + nomeCurso+ "%");};
    }

    public static Specification<EscolaModel> contemCurso(){
        return (root, query, builder) -> {
            query.distinct(true);
            return builder.isNotEmpty(root.get("cursos"));
        };
    }
}
