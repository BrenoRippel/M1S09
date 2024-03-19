package com.senai.m1s09.repository;

import com.senai.m1s09.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
    @Query("update LivroEntity livro set " +
            " livro.titulo = :titulo," +
            " livro.autor = :autor, " +
            " livro.anoPublicacao = :anoPublicacao " +
            " where livro.id = :id")
    LivroEntity update(@Param("titulo") String titulo,
                               @Param("autor") String autor,
                               @Param("anoPublicacao") String anoPublicacao,
                               @Param("id") Long id);
}
