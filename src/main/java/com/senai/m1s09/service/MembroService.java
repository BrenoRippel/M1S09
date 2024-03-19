package com.senai.m1s09.service;

import com.senai.m1s09.entity.MembroEntity;

import java.util.List;

public interface MembroService {

    MembroEntity criar(MembroEntity membro) throws Exception;

    List<MembroEntity> buscarTodos();

    MembroEntity buscarPorId(Long id) throws Exception;

    MembroEntity alterar(Long id, MembroEntity membro) throws Exception;

    void apagar(Long id) throws Exception;

}
