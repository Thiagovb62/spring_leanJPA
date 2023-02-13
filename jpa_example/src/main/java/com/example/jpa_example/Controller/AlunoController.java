package com.example.jpa_example.Controller;


import com.example.jpa_example.Entities.Alunos;
import com.example.jpa_example.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;




    @GetMapping("/list")
    public List < Alunos > getAllAlunos() {
        return alunoService.findAll();
    }

    @GetMapping("/list/{id}")
    public Alunos getAlunoById(@PathVariable Long id) {
        return alunoService.findById(id);
    }

    @PostMapping("/")
    public Alunos saveAluno(@RequestBody Alunos aluno) {
        return alunoService.save(aluno);
    }


}
