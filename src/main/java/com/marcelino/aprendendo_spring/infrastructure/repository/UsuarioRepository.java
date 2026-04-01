package com.marcelino.aprendendo_spring.infrastructure.repository;

import com.marcelino.aprendendo_spring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // spring traduz automaticamente "existsBy" para um select * ... e email;
    boolean existsByEmail(String email);
}
