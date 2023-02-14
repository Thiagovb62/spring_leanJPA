package com.example.jpa_example.Service;


import com.example.jpa_example.Entities.Alunos;
import com.example.jpa_example.Entities.AvaliacaoFisica;
import com.example.jpa_example.Form.AlunoForm;
import com.example.jpa_example.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Alunos save(AlunoForm aluno) {
        Alunos aluno1 = new Alunos();
        aluno1.setNome(aluno.getNome());
        aluno1.setCpf(aluno.getCpf());
        aluno1.setBairro (aluno.getBairro ());
        return alunoRepository.save(aluno1);
    }

    public Alunos getAlunoById(@PathVariable Long id) {
        return alunoRepository.findById(id).get();
    }

    public List<Alunos> findAll() {
        return alunoRepository.findAll();
    }


    public Alunos update(Alunos aluno) {
        return alunoRepository.save(aluno);
    }

}
