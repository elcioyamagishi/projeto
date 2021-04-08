package com.coffee.code.repo;
<<<<<<< HEAD

=======
>>>>>>> 6fef978793d0259485825c24823efcb04a4817b7
import org.springframework.data.repository.CrudRepository;
import com.coffee.code.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
<<<<<<< HEAD
    public Usuario findByEmailOrRacf(String email, String racf
);
    
}
=======
    public Usuario findByEmailOrRacf(String email, String racf);
}
>>>>>>> 6fef978793d0259485825c24823efcb04a4817b7
