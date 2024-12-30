package com.curso.msvc.cursos.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.curso.msvc.cursos.models.Curso;
public interface ICursos extends CrudRepository<Curso, Long> {

}
