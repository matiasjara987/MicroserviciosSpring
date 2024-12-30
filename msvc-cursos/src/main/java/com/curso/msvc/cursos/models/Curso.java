package com.curso.msvc.cursos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cursos")
@Getter @Setter
public class Curso {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;


    

}
