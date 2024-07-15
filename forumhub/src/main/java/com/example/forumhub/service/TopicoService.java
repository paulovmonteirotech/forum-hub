package com.example.forumhub.service;

import com.example.forumhub.model.Topico;
import com.example.forumhub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository repository;

    public Topico criarTopico(Topico topico) {
        if (repository.existsByTituloAndMensagem(topico.getTitulo(), topico.getMensagem())) {
            throw new IllegalArgumentException("Tópico já existe.");
        }
        return repository.save(topico);
    }

    public List<Topico> listarTodos() {
        return repository.findAll();
    }

    public Optional<Topico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Topico atualizarTopico(Long id, Topico topicoAtualizado) {
        Optional<Topico> topicoOpt = repository.findById(id);
        if (topicoOpt.isPresent()) {
            Topico topico = topicoOpt.get();
            topico.setTitulo(topicoAtualizado.getTitulo());
            topico.setMensagem(topicoAtualizado.getMensagem());
            topico.setEstado(topicoAtualizado.getEstado());
            topico.setAutor(topicoAtualizado.getAutor());
            topico.setCurso(topicoAtualizado.getCurso());
            return repository.save(topico);
        }
        throw new IllegalArgumentException("Tópico não encontrado.");
    }

    public void deletarTopico(Long id) {
        repository.deleteById(id);
    }
}
