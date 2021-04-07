package com.coffee.code.repo;

import org.springframework.data.repository.CrudRepository;
import com.coffee.code.model.itmnEvento;

public interface itmnEventoRepo extends CrudRepository <itmnEvento, Integer> {
        public itmnEvento findByNumSeq(Integer numSeq);
    
}
