package com.msvc.usuarios.msvc_usuarios.Controller;

import org.springframework.http.ResponseEntity;


public interface methodsInterface {

    public ResponseEntity<?> findUser(long id);

    public ResponseEntity<?> updateValidation(long id);
}
