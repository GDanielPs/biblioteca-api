package com.biblioteca.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.biblioteca.model.Libro;
import com.biblioteca.service.LibroService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/libros")
@RequiredArgsConstructor
public class LibroController {

    private final LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listar();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.guardar(libro);
    }

    @GetMapping("/{id}")
    public Libro obtenerLibro(@PathVariable Long id) {
        return libroService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminar(id);
    }
}
