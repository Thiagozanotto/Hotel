package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity @Data
public class CargoFuncionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private LocalDate dtSaida;

    @Column(nullable = false)
    private LocalDate dtAdmissao;

    @ManyToOne  @JoinColumn(nullable = false)
    private Funcionario funcionario;

    @ManyToOne  @JoinColumn(nullable = false)
    private Cargo cargo;
}
