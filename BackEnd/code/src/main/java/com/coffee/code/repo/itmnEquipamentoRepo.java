package com.coffee.code.repo;

import org.springframework.data.repository.CrudRepository;
import com.coffee.code.model.itmnEquipamento;

public interface itmnEquipamentoRepo extends CrudRepository <itmnEquipamento, Integer> {
    public itmnEquipamento findByIdEquip(Integer idEquip);
    
}
