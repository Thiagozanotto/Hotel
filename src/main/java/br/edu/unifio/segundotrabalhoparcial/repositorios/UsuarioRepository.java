package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
}
