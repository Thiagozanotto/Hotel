package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.Perfil;
import br.edu.unifio.segundotrabalhoparcial.entidades.PerfilUsurario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository <Perfil, Integer> {
}
