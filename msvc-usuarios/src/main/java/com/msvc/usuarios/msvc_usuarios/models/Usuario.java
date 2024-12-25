package com.msvc.usuarios.msvc_usuarios.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter @Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id;
    private String name;
    private String Lastname;
    
    @Column(unique = true)
    private String email;
}
