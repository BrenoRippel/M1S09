package com.senai.m1s09.repository;

import com.senai.m1s09.entity.EmprestimoEntity;
import com.senai.m1s09.entity.LivroEntity;
import com.senai.m1s09.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Modifying
    @Query("update EmprestimoEntity emprestimo set " +
            " emprestimo.membro = :membro, " +
            " emprestimo.dataEmprestimo = :dataEmprestimo " +
            " where emprestimo.id = :id")
    EmprestimoEntity update(@Param("membro") MembroEntity membro,
                            @Param("dataEmprestimo") String dataEmprestimo,
                            @Param("id") Long id);

}
