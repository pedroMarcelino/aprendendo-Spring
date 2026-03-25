package com.marcelino.aprendendo_spring.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoRepository, Long> {
}
