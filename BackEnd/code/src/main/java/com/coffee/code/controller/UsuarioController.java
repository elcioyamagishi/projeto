package com.coffee.code.controller;

<<<<<<< HEAD
=======
import com.coffee.code.model.Usuario;
import com.coffee.code.repo.UsuarioRepo;
>>>>>>> a1d111b569295439412ea0b437e214c43884ad3b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.coffee.code.model.Usuario;
import com.coffee.code.repo.UsuarioRepo;

=======
>>>>>>> a1d111b569295439412ea0b437e214c43884ad3b
@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

<<<<<<< HEAD
=======
    // api padrao desenvolvida na aula

>>>>>>> a1d111b569295439412ea0b437e214c43884ad3b
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado) {
        Usuario userDoBD = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

<<<<<<< HEAD
        if(userDoBD != null) { // usuário existe no BD 
=======
        if(userDoBD != null) { 
>>>>>>> a1d111b569295439412ea0b437e214c43884ad3b
            if(userDoBD.getSenha().equals(userEnviado.getSenha())) {
                return ResponseEntity.ok(userDoBD);
            }
        }
        return ResponseEntity.notFound().build();
    }
    
<<<<<<< HEAD
}
=======
}
>>>>>>> a1d111b569295439412ea0b437e214c43884ad3b
