package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte codigo;

    @Column( nullable = false, unique = true)
    private String  nome;

    @Column( nullable = false)
    private String cpf;

    @OneToOne @JoinColumn(nullable = false, unique = true)
    private Usuario usuario;
}
