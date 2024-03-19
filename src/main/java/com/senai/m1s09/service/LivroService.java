package com.senai.m1s09.service;

import com.senai.m1s09.entity.LivroEntity;

import java.util.List;

public interface LivroService {

    LivroEntity criar(LivroEntity livro) throws Exception;

    List<LivroEntity> buscarTodos();

    LivroEntity buscarPorId(Long id) throws Exception;

    LivroEntity alterar(Long id, LivroEntity livro) throws Exception;

    void apagar(Long id) throws Exception;

}
