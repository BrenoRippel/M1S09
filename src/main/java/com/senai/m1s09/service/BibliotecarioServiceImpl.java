package com.senai.m1s09.service;

import com.senai.m1s09.entity.BibliotecarioEntity;
import com.senai.m1s09.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioServiceImpl implements BibliotecarioService {

    private final BibliotecarioRepository repository;

    public BibliotecarioServiceImpl(BibliotecarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public BibliotecarioEntity criar(BibliotecarioEntity bibliotecario) throws Exception {
        bibliotecario.setId(null);
        return repository.save(bibliotecario);
    }

    @Override
    public List<BibliotecarioEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public BibliotecarioEntity buscarPorId(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public BibliotecarioEntity alterar(Long id, BibliotecarioEntity bibliotecario) throws Exception {
        BibliotecarioEntity entity = buscarPorId(id);
        entity.setNome(bibliotecario.getNome());
        entity.setEmail(bibliotecario.getEmail());
        entity.setSenha(bibliotecario.getSenha());

        return repository.save(entity);
    }

    @Override
    public void apagar(Long id) throws Exception {
        BibliotecarioEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
