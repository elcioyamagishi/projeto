package com.coffee.code.repo;
import org.springframework.data.repository.CrudRepository;
import com.coffee.code.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}