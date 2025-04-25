package com.ejemplo.libroservice;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    private final LibroRepository repo;

    public LibroService(LibroRepository repo) {
        this.repo = repo;
    }

    public Libro crearLibro(Libro libro) {
        return repo.save(libro);
    }

    public List<Libro> listarLibros() {
        return repo.findAll();
    }

    public Libro buscarLibroPorId(String id) {
        return repo.findById(id).orElse(null);
    }
}
