package com.senai.m1s09.service;

import com.senai.m1s09.entity.EmprestimoEntity;
import com.senai.m1s09.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {

    private final EmprestimoRepository repository;

    public EmprestimoServiceImpl(EmprestimoRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmprestimoEntity criar(EmprestimoEntity emprestimo) throws Exception {
        emprestimo.setId(null);
        return repository.save(emprestimo);
    }

    @Override
    public List<EmprestimoEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public EmprestimoEntity buscarPorId(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public EmprestimoEntity alterar(Long id, EmprestimoEntity emprestimo) throws Exception {
        EmprestimoEntity entity = buscarPorId(id);
        entity.setLivro(emprestimo.getLivro());
        entity.setMembro(emprestimo.getMembro());
        entity.setDataEmprestimo(emprestimo.getDataEmprestimo());
        entity.setDataDevolucao(emprestimo.getDataDevolucao());


        return repository.save(entity);
    }

    @Override
    public void apagar(Long id) throws Exception {
        EmprestimoEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
