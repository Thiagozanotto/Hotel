package beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.CargoFuncionario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Funcionario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoFuncionarioRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.FuncionarioRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Data
@Component
@ViewScoped
public class FuncionarioBean {

    private Funcionario funcionario;

    private List<Funcionario> funcionarios;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public void listar() {
        funcionarios = funcionarioRepository.findAll();
    }
}

