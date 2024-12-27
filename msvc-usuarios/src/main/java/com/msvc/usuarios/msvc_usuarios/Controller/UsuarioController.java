package com.msvc.usuarios.msvc_usuarios.Controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msvc.usuarios.msvc_usuarios.Controller.configuration.Configuration;
import com.msvc.usuarios.msvc_usuarios.models.Usuario;
import com.msvc.usuarios.msvc_usuarios.services.interfaces.UsuarioInterface;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioInterface user;
    private final Configuration cfg;
    
    public UsuarioController( UsuarioInterface user, Configuration cfg) {
        this.user = user;
        this.cfg = cfg;
    }
   
    @GetMapping("/list")
    public List<Usuario>  list() {
        return user.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return cfg.findUser(id);
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user.save(usuario));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @RequestBody Usuario usuario) {
        return cfg.updateValidation(id, usuario);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
       return cfg.delete(id);
        
    }
}