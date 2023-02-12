package com.example.jpa_example.Repository;

import com.example.jpa_example.Entities.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoFisica, Long> {

}
