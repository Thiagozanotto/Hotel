package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class Quarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte codigo;

    @Column
    private Integer numero;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Hotel hotel;
}
