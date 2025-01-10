package com.curso.msvc.cursos.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.msvc.cursos.models.Curso;
import com.curso.msvc.cursos.services.CursoService;

@RestController
public class CursoController {


    private final CursoService service;

    public CursoController(CursoService service){
    this.service = service;
    }

    @GetMapping("/list")
    @Transactional(readOnly = true)
    public ResponseEntity<List<Curso>>  list() {
        return ResponseEntity.ok().body(service.findAll());
    }
    @GetMapping("/list/{id}")
    @Transactional(readOnly = true)
    public Optional <Curso> findCursoById( @PathVariable Long id) {
        return service.findById(id);
    }    
    @PostMapping
    public Curso save(Curso curso) {
        return service.save(curso);
    }
}