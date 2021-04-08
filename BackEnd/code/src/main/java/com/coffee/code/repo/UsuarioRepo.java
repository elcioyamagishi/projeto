package com.coffee.code.repo;
<<<<<<< HEAD

import org.springframework.data.repository.CrudRepository;

=======
import org.springframework.data.repository.CrudRepository;
>>>>>>> a1d111b569295439412ea0b437e214c43884ad3b
import com.coffee.code.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}