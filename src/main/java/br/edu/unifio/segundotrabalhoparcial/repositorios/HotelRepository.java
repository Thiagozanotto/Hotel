package br.edu.unifio.segundotrabalhoparcial.repositorios;

import br.edu.unifio.segundotrabalhoparcial.entidades.Hotel;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository <Hotel,Integer > {
}
