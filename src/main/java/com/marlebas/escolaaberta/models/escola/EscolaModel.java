package com.marlebas.escolaaberta.models.escola;

import com.marlebas.escolaaberta.models.curso.CursoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
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

    private String telefone;

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CursoModel> cursos = new ArrayList<>();
}
