package com.marlebas.escolaaberta.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "db_projetosocial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetoSocialModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_projeto", nullable = false)
    private String nome;

    private String descricao;

    private String categoria;

    private String publicoAlvo;

    private String status;

    @ManyToOne
    @JoinColumn(name = "escola_id")
    private EscolaModel escola;

}
