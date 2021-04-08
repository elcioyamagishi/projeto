package com.coffee.code.controller;

import java.util.List;
import com.coffee.code.model.Alarme;
import com.coffee.code.repo.AlarmeRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") // aceita requisições de qualquer domínio
@RequestMapping("/alarme")
public class AlarmeController {
    @Autowired
    private AlarmeRepo repo;

    @GetMapping("/all")
    public List<Alarme> getAllAlarmes() {
        List<Alarme> lista = (List<Alarme>) repo.findAll();
        return lista;
    }
}

