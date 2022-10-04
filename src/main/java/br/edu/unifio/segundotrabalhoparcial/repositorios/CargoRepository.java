package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository <Cargo, Integer> {
}
