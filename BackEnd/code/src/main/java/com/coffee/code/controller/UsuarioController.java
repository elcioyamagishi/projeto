package com.coffee.code.controller;

import com.coffee.code.model.Usuario;
import com.coffee.code.repo.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado) {
        Usuario userDoDB = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

        if(userDoDB != null) { // usuario existe}
            if(userDoDB.getSenha().equals(userEnviado.getSenha())) {
                return ResponseEntity.ok(userDoDB);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Usuario> getAllUsers() {
        List<Usuario> lista = (List <Usuario>) repo.findAll();

        return lista;
    }
}
