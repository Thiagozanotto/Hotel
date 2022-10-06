package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository <Perfil, Integer> {
}
