package com.marlebas.escolaaberta.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_escolas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscolaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_escola", nullable = false)
    private String nome;

    @Column(unique = true, nullable = false, length = 8)
    private String inep;

    private String endereco;

    private String numero;

    private String complemento;

    private String bairro;

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL)
    private List<ProjetoSocialModel> projetos;
}
