package com.coffee.code.controller;

import com.coffee.code.model.Usuario;
import com.coffee.code.repo.UsuarioRepo;
<<<<<<< HEAD

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
>>>>>>> 6fef978793d0259485825c24823efcb04a4817b7
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 6fef978793d0259485825c24823efcb04a4817b7
@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
<<<<<<< HEAD
    @Autowired
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado) {
        Usuario userDoDB = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

        if(userDoDB != null) { // usuario existe}
            if(userDoDB.getSenha().equals(userEnviado.getSenha())) {
                return ResponseEntity.ok(userDoDB);
=======
    
    @Autowired
    private UsuarioRepo repo;

    // api padrao desenvolvida na aula

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado) {
        Usuario userDoBD = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

        if(userDoBD != null) { 
            if(userDoBD.getSenha().equals(userEnviado.getSenha())) {
                return ResponseEntity.ok(userDoBD);
>>>>>>> 6fef978793d0259485825c24823efcb04a4817b7
            }
        }
        return ResponseEntity.notFound().build();
    }
<<<<<<< HEAD

    @GetMapping("/all")
    public List<Usuario> getAllUsers() {
        List<Usuario> lista = (List <Usuario>) repo.findAll();

        return lista;
    }
}
=======
    
}
>>>>>>> 6fef978793d0259485825c24823efcb04a4817b7
