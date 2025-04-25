package com.ejemplo.autorservice;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {
    private final AutorRepository repo;

    public AutorService(AutorRepository repo) {
        this.repo = repo;
    }

    public Autor crearAutor(Autor autor) {
        return repo.save(autor);
    }

    public List<Autor> listarAutores() {
        return repo.findAll();
    }

    public Autor buscarAutorPorId(String id) {
        return repo.findById(id).orElse(null);
    }
}
