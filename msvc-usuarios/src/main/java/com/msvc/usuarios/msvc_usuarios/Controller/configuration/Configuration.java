package com.msvc.usuarios.msvc_usuarios.Controller.configuration;

import org.springframework.http.ResponseEntity;
import com.msvc.usuarios.msvc_usuarios.models.Usuario;

public interface Configuration {

     public ResponseEntity<?> findUser(long id);

    public ResponseEntity<?> updateValidation(long id, Usuario usuario);

    public ResponseEntity<?> delete(long id);
}

