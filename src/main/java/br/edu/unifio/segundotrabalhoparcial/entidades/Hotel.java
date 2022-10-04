package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity @Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column
    private String nomeFantasia;

    @Column
    private String razaoSocial;

    @Column
    private String cnpj;
}
