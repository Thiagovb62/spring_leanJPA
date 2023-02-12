package com.example.jpa_example.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table ( name = "matricula")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {

    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column ( name = "data_matricula")
    private String data_matricula;

    @OneToOne ( cascade = CascadeType.ALL)
    @JoinColumn ( name = "aluno_id")
    private Alunos alunos;
}
