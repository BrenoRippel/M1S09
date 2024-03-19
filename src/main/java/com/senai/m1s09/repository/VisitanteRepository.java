package com.senai.m1s09.repository;

import com.senai.m1s09.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
    @Query("update VisitanteEntity visitante set " +
            " visitante.nome = :nome," +
            " visitante.telefone = :telefone " +
            " where visitante.id = :id")
    VisitanteEntity update(@Param("nome") String nome,
                        @Param("telefone") String telefone,
                        @Param("id") Long id);
}
