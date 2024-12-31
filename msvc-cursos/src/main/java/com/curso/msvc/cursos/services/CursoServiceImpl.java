package com.curso.msvc.cursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.msvc.cursos.Repositories.ICursos;
import com.curso.msvc.cursos.models.Curso;


@Service
public class CursoServiceImpl implements CursoService {

    private final ICursos cursosRepository;

    public CursoServiceImpl(ICursos cursosRepository) {
        this.cursosRepository = cursosRepository;
    }
    @Override
    @Transactional(readOnly = true)
    public List<Curso> findAll() {
     return (List<Curso>) cursosRepository.findAll();   
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Curso> findById(Long id) {
        return cursosRepository.findById(id);
    }

    @Override
    @Transactional
    public Curso save(Curso curso) {
        return cursosRepository.save(curso);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        cursosRepository.deleteById(id);
    }

}
