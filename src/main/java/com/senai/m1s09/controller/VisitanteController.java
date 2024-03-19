package com.senai.m1s09.controller;

import com.senai.m1s09.entity.VisitanteEntity;
import com.senai.m1s09.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitantes")
public class VisitanteController {

    private final VisitanteService service;

    public VisitanteController(VisitanteService service) {
        this.service = service;
    }

    @GetMapping
    public List<VisitanteEntity> get() {
        return service.buscarTodos();
    }

    @GetMapping("{id}")
    public VisitanteEntity getId(@PathVariable Long id) throws Exception {
        return service.buscarPorId(id);
    }

    @PostMapping
    public VisitanteEntity post(@RequestBody VisitanteEntity visitante) throws Exception {
        return service.criar(visitante);
    }

    @PutMapping("{id}")
    public VisitanteEntity put(@PathVariable Long id, @RequestBody VisitanteEntity visitante) throws Exception {
        return service.alterar(id, visitante);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) throws Exception {
        service.apagar(id);
    }

}