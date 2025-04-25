package com.ejemplo.autorservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {
    private final AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Autor> crear(@RequestBody Autor autor) {
        return ResponseEntity.ok(service.crearAutor(autor));
    }

    @GetMapping
    public ResponseEntity<List<Autor>> listar() {
        return ResponseEntity.ok(service.listarAutores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> obtener(@PathVariable String id) {
        return ResponseEntity.ok(service.buscarAutorPorId(id));
    }
}
