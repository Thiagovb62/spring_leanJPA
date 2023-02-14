package com.example.jpa_example.Service;


import com.example.jpa_example.Entities.Alunos;
import com.example.jpa_example.Entities.AvaliacaoFisica;
import com.example.jpa_example.Form.AvaliacaoFisicaForm;
import com.example.jpa_example.Repository.AlunoRepository;
import com.example.jpa_example.Repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public AvaliacaoFisicaService(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public AvaliacaoFisica save(AvaliacaoFisicaForm avaliacaoFisica) {
        Alunos aluno = alunoRepository.findById(avaliacaoFisica.getAlunoId ()).get();
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        avaliacao.setAlunos(aluno);
        avaliacao.setNome(avaliacaoFisica.getNome());
        avaliacao.setPeso(avaliacaoFisica.getPeso());
        avaliacao.setAltura(avaliacaoFisica.getAltura());
        return avaliacaoRepository.save(avaliacao);
    }

    public AvaliacaoFisica findById(Long id) {
        return avaliacaoRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        avaliacaoRepository.deleteById(id);
    }


}
