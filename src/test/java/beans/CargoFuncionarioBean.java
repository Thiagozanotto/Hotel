package beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import br.edu.unifio.segundotrabalhoparcial.entidades.CargoFuncionario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoFuncionarioRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Data
@Component
@ViewScoped
public class CargoFuncionarioBean {

    private CargoFuncionario cargoFuncionario;

    private List<CargoFuncionario> cargoFuncionarios;

    @Autowired
    private CargoFuncionarioRepository cargoFuncionarioRepository;

    public void listar() {
        cargoFuncionarios = cargoFuncionarioRepository.findAll();
    }
}
