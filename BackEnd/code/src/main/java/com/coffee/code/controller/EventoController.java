package com.coffee.code.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.coffee.code.model.BetweenDate;
import com.coffee.code.model.Evento;
import com.coffee.code.repo.EventoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") // aceita requisições de qualquer domínio
@RequestMapping("/event")
public class EventoController {
    @Autowired
    private EventoRepo repo;

    @GetMapping("/id/{eventId}")
    public ResponseEntity<Evento> getEvent(@PathVariable int eventId) {
        Evento eventoEncontrado = repo.findById(eventId).orElse(null);

        if (eventoEncontrado != null) {
            return ResponseEntity.ok(eventoEncontrado);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/between")
    // referência: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
    public List<Evento> between(@RequestBody BetweenDate data) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate from = LocalDate.parse(data.getFrom(), fmt);
        LocalDate to = LocalDate.parse(data.getTo(), fmt);

        List<Evento> listaEventos = (List<Evento>) repo.findAllByDataEventoBetweenOrderByDataEvento(from, to);

        return listaEventos;
    }
}
