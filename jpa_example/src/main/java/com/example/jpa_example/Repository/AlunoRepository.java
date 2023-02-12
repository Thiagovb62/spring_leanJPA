package com.example.jpa_example.Repository;

import com.example.jpa_example.Entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository < Alunos, Long > {
}
