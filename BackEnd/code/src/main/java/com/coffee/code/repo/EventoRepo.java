package com.coffee.code.repo;

import java.time.LocalDate;
import java.util.List;

import com.coffee.code.model.Evento;

import org.springframework.data.repository.CrudRepository;

public interface EventoRepo extends CrudRepository<Evento, Integer> {
    public List<Evento> findAllByDataEventoBetweenOrderByDataEvento(LocalDate dataDe, LocalDate dataAte);
}