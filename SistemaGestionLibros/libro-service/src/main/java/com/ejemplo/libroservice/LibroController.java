package com.ejemplo.libroservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Libro> crear(@RequestBody Libro libro) {
        return ResponseEntity.ok(service.crearLibro(libro));
    }

    @GetMapping
    public ResponseEntity<List<Libro>> listar() {
        return ResponseEntity.ok(service.listarLibros());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtener(@PathVariable String id) {
        return ResponseEntity.ok(service.buscarLibroPorId(id));
    }
}
