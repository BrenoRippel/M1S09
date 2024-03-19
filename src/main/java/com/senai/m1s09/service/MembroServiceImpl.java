package com.senai.m1s09.service;

import com.senai.m1s09.entity.MembroEntity;
import com.senai.m1s09.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroServiceImpl implements MembroService {

    private final MembroRepository repository;

    public MembroServiceImpl(MembroRepository repository) {
        this.repository = repository;
    }

    @Override
    public MembroEntity criar(MembroEntity membro) throws Exception {
        membro.setId(null);
        return repository.save(membro);
    }

    @Override
    public List<MembroEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public MembroEntity buscarPorId(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public MembroEntity alterar(Long id, MembroEntity membro) throws Exception {
        MembroEntity entity = buscarPorId(id);
        entity.setNome(membro.getNome());
        entity.setEndereco(membro.getEndereco());
        entity.setTelefone(membro.getTelefone());

        return repository.save(entity);
    }

    @Override
    public void apagar(Long id) throws Exception {
        MembroEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
