package com.coffee.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.code.model.Usuario;
import com.coffee.code.repo.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado) {
        Usuario userDoBD = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

        if(userDoBD != null) { // usuário existe no BD 
            if(userDoBD.getSenha().equals(userEnviado.getSenha())) {
                return ResponseEntity.ok(userDoBD);
            }
        }
        return ResponseEntity.notFound().build();
    }
    
}
