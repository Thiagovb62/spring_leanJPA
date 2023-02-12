package com.example.jpa_example.Repository;

import com.example.jpa_example.Entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
