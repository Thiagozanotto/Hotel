package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.Perfil;
import br.edu.unifio.segundotrabalhoparcial.entidades.PerfilUsurario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilUsuarioRepository extends JpaRepository <PerfilUsurario, Integer> {
}
