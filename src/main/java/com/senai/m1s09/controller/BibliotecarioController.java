package com.senai.m1s09.controller;

import com.senai.m1s09.entity.BibliotecarioEntity;
import com.senai.m1s09.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioService service;

    public BibliotecarioController(BibliotecarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<BibliotecarioEntity> get() {
        return service.buscarTodos();
    }

    @GetMapping("{id}")
    public BibliotecarioEntity getId(@PathVariable Long id) throws Exception {
        return service.buscarPorId(id);
    }

    @PostMapping
    public BibliotecarioEntity post(@RequestBody BibliotecarioEntity bibliotecario) throws Exception {
        return service.criar(bibliotecario);
    }

    @PutMapping("{id}")
    public BibliotecarioEntity put(@PathVariable Long id, @RequestBody BibliotecarioEntity bibliotecario) throws Exception {
        return service.alterar(id, bibliotecario);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) throws Exception {
        service.apagar(id);
    }

}