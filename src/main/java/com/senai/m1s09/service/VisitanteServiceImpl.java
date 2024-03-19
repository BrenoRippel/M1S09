package com.senai.m1s09.service;

import com.senai.m1s09.entity.VisitanteEntity;
import com.senai.m1s09.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteServiceImpl implements VisitanteService {

    private final VisitanteRepository repository;

    public VisitanteServiceImpl(VisitanteRepository repository) {
        this.repository = repository;
    }

    @Override
    public VisitanteEntity criar(VisitanteEntity visitante) throws Exception {
        visitante.setId(null);
        return repository.save(visitante);
    }

    @Override
    public List<VisitanteEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public VisitanteEntity buscarPorId(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public VisitanteEntity alterar(Long id, VisitanteEntity visitante) throws Exception {
        VisitanteEntity entity = buscarPorId(id);
        entity.setNome(visitante.getNome());
        entity.setTelefone(visitante.getTelefone());

        return repository.save(entity);
    }

    @Override
    public void apagar(Long id) throws Exception {
        VisitanteEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
