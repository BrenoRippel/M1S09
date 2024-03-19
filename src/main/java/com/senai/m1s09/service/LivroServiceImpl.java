package com.senai.m1s09.service;

import com.senai.m1s09.entity.LivroEntity;
import com.senai.m1s09.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository repository;

    public LivroServiceImpl(LivroRepository repository) {
        this.repository = repository;
    }

    @Override
    public LivroEntity criar(LivroEntity livro) throws Exception {
        livro.setId(null);
        return repository.save(livro);
    }

    @Override
    public List<LivroEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public LivroEntity buscarPorId(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public LivroEntity alterar(Long id, LivroEntity livro) throws Exception {
        LivroEntity entity = buscarPorId(id);
        entity.setTitulo(livro.getTitulo());
        entity.setAutor(livro.getAutor());
        entity.setAnoPublicacao(livro.getAnoPublicacao());

        return repository.save(entity);
    }

    @Override
    public void apagar(Long id) throws Exception {
        LivroEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
