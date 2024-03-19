package com.senai.m1s09.controller;

import com.senai.m1s09.entity.MembroEntity;
import com.senai.m1s09.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class MembroController {

    private final MembroService service;

    public MembroController(MembroService service) {
        this.service = service;
    }

    @GetMapping
    public List<MembroEntity> get() {
        return service.buscarTodos();
    }

    @GetMapping("{id}")
    public MembroEntity getId(@PathVariable Long id) throws Exception {
        return service.buscarPorId(id);
    }

    @PostMapping
    public MembroEntity post(@RequestBody MembroEntity membro) throws Exception {
        return service.criar(membro);
    }

    @PutMapping("{id}")
    public MembroEntity put(@PathVariable Long id, @RequestBody MembroEntity membro) throws Exception {
        return service.alterar(id, membro);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) throws Exception {
        service.apagar(id);
    }

}