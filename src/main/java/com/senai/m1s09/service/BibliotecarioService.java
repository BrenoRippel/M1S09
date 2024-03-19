package com.senai.m1s09.service;

import com.senai.m1s09.entity.BibliotecarioEntity;

import java.util.List;

public interface BibliotecarioService {

    BibliotecarioEntity criar(BibliotecarioEntity bibliotecario) throws Exception;

    List<BibliotecarioEntity> buscarTodos();

    BibliotecarioEntity buscarPorId(Long id) throws Exception;

    BibliotecarioEntity alterar(Long id, BibliotecarioEntity bibliotecario) throws Exception;

    void apagar(Long id) throws Exception;

}
