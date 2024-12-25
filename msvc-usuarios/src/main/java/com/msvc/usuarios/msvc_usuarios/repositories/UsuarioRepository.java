package com.msvc.usuarios.msvc_usuarios.repositories;

import org.springframework.data.repository.CrudRepository;

import com.msvc.usuarios.msvc_usuarios.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
