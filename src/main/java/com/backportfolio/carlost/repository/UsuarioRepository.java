
package com.backportfolio.carlost.repository;

import com.backportfolio.carlost.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository <Usuario,Integer>{
    Optional<Usuario> findByEmail(String email);
}
