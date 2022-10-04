package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.CargoFuncionario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoFuncionarioRepository extends JpaRepository <CargoFuncionario, Integer> {
}
