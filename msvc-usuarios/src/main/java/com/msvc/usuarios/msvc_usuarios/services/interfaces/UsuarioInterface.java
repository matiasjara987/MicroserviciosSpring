package com.msvc.usuarios.msvc_usuarios.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.msvc.usuarios.msvc_usuarios.models.Usuario;
@Service
public interface UsuarioInterface {
List<Usuario> findAll();
Optional<Usuario> findById(long id);
Usuario save(Usuario usuario);
void deleteById(long id);

}
