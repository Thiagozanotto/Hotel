package beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Data @Component @ViewScoped
public class CargoBean {

    private Cargo cargo;
    private List<Cargo> cargos;

    @Autowired
    private CargoRepository cargoRepository;

    public void listar() {
        cargos = cargoRepository.findAll();
    }
}
