package com.msvc.usuarios.msvc_usuarios.Controller.configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.msvc.usuarios.msvc_usuarios.models.Usuario;
import com.msvc.usuarios.msvc_usuarios.services.interfaces.UsuarioInterface;

public class ConfigurationImpl implements Configuration{

@Autowired
UsuarioInterface service;
@Override
    public ResponseEntity<?> findUser(long id){
        Optional<Usuario>  u = service.findById(id);
        if(u.isPresent()) {
            return ResponseEntity.ok().body(u.get());
        }
        return ResponseEntity.notFound().build();
    }
@Override
    public ResponseEntity<?> updateValidation(long id, Usuario usuario){
        Optional<Usuario> u = service.findById(id);
        if (u.isPresent()) {
            Usuario userDb = u.get();
            userDb.setName(usuario.getName());
            userDb.setLastname(usuario.getLastname());
            userDb.setEmail(usuario.getEmail());
            return ResponseEntity.ok().body(service.save(userDb));
        } 
         return ResponseEntity.notFound().build();
}

@Override
    public ResponseEntity<?> delete(long id){
        Optional<Usuario> u = service.findById(id);
        if (u.isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

