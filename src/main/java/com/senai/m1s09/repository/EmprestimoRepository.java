package com.senai.m1s09.repository;

import com.senai.m1s09.entity.EmprestimoEntity;
import com.senai.m1s09.entity.LivroEntity;
import com.senai.m1s09.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

        @Query("update EmprestimoEntity emprestimo set " +
            " emprestimo.livro = :livro," +
            " emprestimo.membro = :membro, " +
            " emprestimo.dataEmprestimo = :dataEmprestimo " +
            " where emprestimo.id = :id")
    EmprestimoEntity update(@Param("livro") MembroEntity livro,
                               @Param("membro") LivroEntity membro,
                               @Param("dataEmprestimo") String dataEmprestimo,
                               @Param("dataDevolucao") String dataDevolucao,
                               @Param("id") Long id);
}
