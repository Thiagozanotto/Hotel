package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity @Data
public class Hospede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte codigo;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String celular;

    @Column
    private String email;

    @Column
    private String endereco;

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private Usuario usuario;
}
