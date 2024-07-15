package com.example.forumhub.controller;

import com.example.forumhub.model.Topico;
import com.example.forumhub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService service;

    @PostMapping
    public Topico criarTopico(@RequestBody @Valid Topico topico) {
        return service.criarTopico(topico);
    }

    @GetMapping
    public List<Topico> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Topico> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Topico atualizarTopico(@PathVariable Long id, @RequestBody @Valid Topico topico) {
        return service.atualizarTopico(id, topico);
    }

    @DeleteMapping("/{id}")
    public void deletarTopico(@PathVariable Long id) {
        service.deletarTopico(id);
    }
}
