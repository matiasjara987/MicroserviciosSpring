package com.curso.msvc.cursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.msvc.cursos.Repositories.ICursos;
import com.curso.msvc.cursos.models.Curso;

@Service
public class CursoServiceImpl implements CursoService {

    private final ICursos cursosRepository;
    public CursoServiceImpl(ICursos cursosRepository) {
        this.cursosRepository = cursosRepository;
    }
    @Override
    public List<Curso> findAll() {
     return (List<Curso>) cursosRepository.findAll();   
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return cursosRepository.findById(id);
    }

    @Override
    public Curso save(Curso curso) {
        return cursosRepository.save(curso);
    }

    @Override
    public void deleteById(Long id) {
        cursosRepository.deleteById(id);
    }

}
