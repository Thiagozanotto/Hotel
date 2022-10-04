package br.edu.unifio.segundotrabalhoparcial.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PerfilUsurario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;
}
