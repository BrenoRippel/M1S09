package com.senai.m1s09.controller;

import com.senai.m1s09.entity.LivroEntity;
import com.senai.m1s09.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<LivroEntity> get() {
        return service.buscarTodos();
    }

    @GetMapping("{id}")
    public LivroEntity getId(@PathVariable Long id) throws Exception {
        return service.buscarPorId(id);
    }

    @PostMapping
    public LivroEntity post(@RequestBody LivroEntity livro) throws Exception {
        return service.criar(livro);
    }

    @PutMapping("{id}")
    public LivroEntity put(@PathVariable Long id, @RequestBody LivroEntity livro) throws Exception {
        return service.alterar(id, livro);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) throws Exception {
        service.apagar(id);
    }

}