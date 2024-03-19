package com.senai.m1s09.repository;

import com.senai.m1s09.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
    @Query("update MembroEntity membro set " +
            " membro.nome = :nome," +
            " membro.endereco = :endereco, " +
            " membro.telefone = :telefone " +
            " where membro.id = :id")
    MembroEntity update(@Param("nome") String nome,
                               @Param("endereco") String endereco,
                               @Param("telefone") String telefone,
                               @Param("id") Long id);
}
