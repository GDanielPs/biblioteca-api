package com.biblioteca.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.biblioteca.model.Libro;
import com.biblioteca.repository.LibroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibroService {

    private final LibroRepository libroRepository;

    public List<Libro> listar() {
        return libroRepository.findAll();
    }

    public Libro guardar(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro buscarPorId(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        libroRepository.deleteById(id);
    }
}
