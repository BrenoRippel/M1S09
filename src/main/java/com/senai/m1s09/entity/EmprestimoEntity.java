package com.senai.m1s09.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "emprestimo")
public class EmprestimoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "membro_id")
    private MembroEntity membro;

    private String dataEmprestimo;

    private String dataDevolucao;

}