package com.msvc.usuarios.msvc_usuarios.Controller.configuration;

import org.springframework.http.ResponseEntity;

public interface Configuration {

     public ResponseEntity<?> findUser(long id);

    public ResponseEntity<?> updateValidation(long id);
}
