package com.msvc.usuarios.msvc_usuarios.services.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msvc.usuarios.msvc_usuarios.models.Usuario;
import com.msvc.usuarios.msvc_usuarios.repositories.UsuarioRepository;
import com.msvc.usuarios.msvc_usuarios.services.interfaces.UsuarioInterface;

@Service
public class UsuarioImplement  implements UsuarioInterface{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        usuarioRepository.deleteById(id);
    }

}
