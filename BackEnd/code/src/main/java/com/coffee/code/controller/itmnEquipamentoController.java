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
//import java.util.List;

import com.coffee.code.model.itmnEquipamento;
import com.coffee.code.repo.itmnEquipamentoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/equipamento")
public class itmnEquipamentoController {

    @Autowired // injeção de dependecia 
    private itmnEquipamentoRepo repo;

    @GetMapping("idEquip/{idEquip}")
    public ResponseEntity<itmnEquipamento> getEquip(@PathVariable int idEquip) {
        itmnEquipamento equipEncontrado = repo.findByIdEquip(idEquip);
        if(equipEncontrado != null) {
            return ResponseEntity.ok(equipEncontrado);
        }
        return ResponseEntity.notFound().build();
    }


    
}
