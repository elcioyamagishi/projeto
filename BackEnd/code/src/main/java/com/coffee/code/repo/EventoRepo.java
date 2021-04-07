package com.coffee.code.repo;

import java.util.Date;
import java.util.List;

import com.coffee.code.model.Evento;

import org.springframework.data.repository.CrudRepository;

public interface EventoRepo extends CrudRepository<Evento, Integer> {
    public List<Evento> findAllByDataEventoBetween(Date dataDe, Date dataAte);
}