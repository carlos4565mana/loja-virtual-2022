package com.dev.backend.repository;

import com.dev.backend.entity.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApostaRepository extends JpaRepository<Aposta, Long> {
}
