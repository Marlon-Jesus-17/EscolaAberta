package com.marlebas.escolaaberta.models.curso;

import com.marlebas.escolaaberta.models.escola.EscolaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cursos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_curso", nullable = false)
    private String nome;

    private String area;

    @ManyToOne
    @JoinColumn(name = "escola_inep", referencedColumnName = "inep")
    private EscolaModel escola;

}
