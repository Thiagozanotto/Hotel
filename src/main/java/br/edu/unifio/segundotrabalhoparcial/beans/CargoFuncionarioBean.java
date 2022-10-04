package br.edu.unifio.segundotrabalhoparcial.beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import br.edu.unifio.segundotrabalhoparcial.entidades.CargoFuncionario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Funcionario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoFuncionarioRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.FuncionarioRepository;
import lombok.Data;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Data
@Component
@ViewScoped
public class CargoFuncionarioBean {

    private CargoFuncionario cargoFuncionario;

    private List<CargoFuncionario> cargoFuncionarios;

    private List<Funcionario> funcionarios;
    private List<Cargo> cargos;

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private CargoFuncionarioRepository cargoFuncionarioRepository;

    public void listar() {
        cargoFuncionarios = cargoFuncionarioRepository.findAll();
    }

    public void novo() {
        cargoFuncionario = new CargoFuncionario();
        funcionarios = funcionarioRepository.findAll();
        cargos = cargoRepository.findAll();
    }

    public void salvar() {
        try {
            cargoFuncionarioRepository.save(cargoFuncionario);
            Messages.addFlashGlobalInfo("Registro salvo com sucesso!");
        } catch (DataIntegrityViolationException excecao){
            excecao.printStackTrace();
            Messages.addFlashGlobalError("Esse Cargo de Funcionario já existe!");
        }
    }
    public void selecionarExclusao(CargoFuncionario cursor){
        Faces.setFlashAttribute("cursor", cursor);
        Faces.navigate("cargoFuncionario-exclusao.xhtml?faces-redirect=true");
    }
    public void selecionarEdicao(CargoFuncionario cursor){
        Faces.setFlashAttribute("cursor", cursor);
        Faces.navigate("cargoFuncionario-edicao.xhtml?faces-redirect=true");
    }

    public void carregar(){
        cargoFuncionario = Faces.getFlashAttribute("cursor");
    }

    public void excluir(){
        cargoFuncionarioRepository.delete(cargoFuncionario);
        Messages.addFlashGlobalInfo("Registro removido com sucesso!");
        Faces.navigate("cargoFuncionario-listagem.xhtml?faces-redirect=true");
    }
}
