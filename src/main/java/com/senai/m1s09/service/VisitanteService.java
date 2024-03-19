package com.senai.m1s09.service;

import com.senai.m1s09.entity.VisitanteEntity;

import java.util.List;

public interface VisitanteService {

    VisitanteEntity criar(VisitanteEntity visitante) throws Exception;

    List<VisitanteEntity> buscarTodos();

    VisitanteEntity buscarPorId(Long id) throws Exception;

    VisitanteEntity alterar(Long id, VisitanteEntity visitante) throws Exception;

    void apagar(Long id) throws Exception;

}
