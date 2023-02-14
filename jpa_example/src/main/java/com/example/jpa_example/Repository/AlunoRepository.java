package com.example.jpa_example.Repository;

import com.example.jpa_example.Entities.Alunos;
import com.example.jpa_example.Entities.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository < Alunos, Long > {

}
