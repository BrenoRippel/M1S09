package com.senai.m1s09.repository;

import com.senai.m1s09.entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
    @Query("update BibliotecarioEntity bibliotecario set " +
            " bibliotecario.nome = :nome," +
            " bibliotecario.email = :email, " + 
            " bibliotecario.senha = :senha " +
            " where bibliotecario.id = :id")
    BibliotecarioEntity update(@Param("nome") String nome,
                         @Param("email") String email,
                         @Param("senha") String senha,
                         @Param("id") Long id);
}
