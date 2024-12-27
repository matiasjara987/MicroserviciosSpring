package com.msvc.usuarios.msvc_usuarios.Controller;


import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msvc.usuarios.msvc_usuarios.models.Usuario;
import com.msvc.usuarios.msvc_usuarios.services.interfaces.UsuarioInterface;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioInterface user;
    private final methodsInterface methods;
    
    public UsuarioController( UsuarioInterface user, methodsInterface methods) {
        this.user = user;
        this.methods = methods;
    }
   
    @GetMapping("/list")
    public List<Usuario>  list() {
        return user.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return methods.findUser(id);
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Usuario usuario) {
        return ResponseEntity.ok().body(this.user.save(usuario));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @RequestBody Usuario usuario) {
        return methods.updateValidation(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        user.deleteById(id);
        
    }
}