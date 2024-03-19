package com.senai.m1s09.service;

import com.senai.m1s09.entity.EmprestimoEntity;

import java.util.List;

public interface EmprestimoService {

    EmprestimoEntity criar(EmprestimoEntity emprestimo) throws Exception;

    List<EmprestimoEntity> buscarTodos();

    EmprestimoEntity buscarPorId(Long id) throws Exception;

    EmprestimoEntity alterar(Long id, EmprestimoEntity emprestimo) throws Exception;

    void apagar(Long id) throws Exception;

}
