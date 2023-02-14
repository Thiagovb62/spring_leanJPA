package com.example.jpa_example.Form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    public Long AlunoId;

    public String nome;

    public String cpf;

    public String Bairro;

    public List<AvaliacaoFisicaForm> avaliacaoFisica;
}
