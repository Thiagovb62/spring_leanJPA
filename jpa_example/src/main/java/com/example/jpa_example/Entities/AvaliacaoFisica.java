package com.example.jpa_example.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table ( name = "avaliacao_fisica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisica {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne ( cascade = CascadeType.ALL)
    @JoinColumn ( name = "aluno_id")
    private Alunos alunos;

    @Column ( name = "nome")
    private String nome;

    @Column ( name = "cpf")
    private Double peso;


    @Column ( name = "altura")
    private Double altura;
}
