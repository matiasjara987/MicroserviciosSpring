package com.curso.msvc.cursos.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
     
}