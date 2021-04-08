package com.coffee.code.repo;
import org.springframework.data.repository.CrudRepository;
import com.coffee.code.model.Alarme;

public interface  AlarmeRepo extends CrudRepository <Alarme, Integer> {
    
}
