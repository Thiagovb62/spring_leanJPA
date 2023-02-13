package com.example.jpa_example.Service;


import com.example.jpa_example.Entities.Alunos;
import com.example.jpa_example.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Alunos save( Alunos aluno) {
        return alunoRepository.save(aluno);
    }

    public Alunos findById( Long id) {
        return alunoRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    public List <Alunos> findAll() {
        return alunoRepository.findAll();
    }

    public Alunos update(Alunos aluno) {
        return alunoRepository.save(aluno);
    }

}
