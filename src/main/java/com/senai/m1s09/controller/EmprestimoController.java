package com.senai.m1s09.controller;

import com.senai.m1s09.entity.EmprestimoEntity;
import com.senai.m1s09.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmprestimoEntity> get() {
        return service.buscarTodos();
    }

    @GetMapping("{id}")
    public EmprestimoEntity getId(@PathVariable Long id) throws Exception {
        return service.buscarPorId(id);
    }

    @PostMapping
    public EmprestimoEntity post(@RequestBody EmprestimoEntity emprestimo) throws Exception {
        return service.criar(emprestimo);
    }

    @PutMapping("{id}")
    public EmprestimoEntity put(@PathVariable Long id, @RequestBody EmprestimoEntity emprestimo) throws Exception {
        return service.alterar(id, emprestimo);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) throws Exception {
        service.apagar(id);
    }

}