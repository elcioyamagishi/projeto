package com.coffee.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import com.coffee.code.model.itmnEvento;
import com.coffee.code.repo.itmnEventoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/evento")

public class itmnEventoController {

    @Autowired // injeção de dependecia 
    private itmnEventoRepo repo;

    @GetMapping("numSeq/{numSeq}")
    public ResponseEntity<itmnEvento> getEvento(@PathVariable int numSeq) {
        itmnEvento eventoEncontrado = repo.findByNumSeq(numSeq);
        if(eventoEncontrado != null) {
            return ResponseEntity.ok(eventoEncontrado);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<itmnEvento> getAllitmnEventos() {
        List<itmnEvento> lista = (List<itmnEvento>) repo.findAll();
        return lista;
    }

}
