package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity @Data
public class Hospedagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte codigo;

    @Column(nullable = false)
    private LocalDateTime hrSaida;

    @Column(nullable = false)
    private LocalDateTime hrEntrada;

    @OneToOne  @JoinColumn(nullable = false, unique = true)
    private Funcionario funcionario;

    @ManyToOne @JoinColumn(nullable = false)
    private Hospede hospede;

    @ManyToOne  @JoinColumn(nullable = false)
    private Quarto quarto;
}

