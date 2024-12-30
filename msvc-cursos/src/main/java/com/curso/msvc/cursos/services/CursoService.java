package com.curso.msvc.cursos.services;

import java.util.List;
import java.util.Optional;

import com.curso.msvc.cursos.models.Curso;

public interface CursoService {

    List<Curso> findAll();
    Optional<Curso> findById(Long id);
    Curso save(Curso curso);
    void deleteById(Long id);
}
