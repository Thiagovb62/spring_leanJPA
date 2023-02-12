package com.example.jpa_example.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table ( name = "alunos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties ( { "hibernateLazyInitializer" , "handler" })
public class Alunos {


    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


    @Column ( name = "nome")
    private String nome;

    @Column ( name = "cpf")
    private String cpf;


    @Column ( name = "bairro")
    private String bairro;

    @OneToMany ( mappedBy = "alunos", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore

    private List < AvaliacaoFisica > avaliacaoFisica = new ArrayList <> ( );

}
