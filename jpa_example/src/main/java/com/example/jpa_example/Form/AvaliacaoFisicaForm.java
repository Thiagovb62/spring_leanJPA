package com.example.jpa_example.Form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    private Long alunoId;

    private String nome;

    private Double peso;

    private Double altura;
}
