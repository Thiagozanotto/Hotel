package br.edu.unifio.segundotrabalhoparcial.beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.CargoFuncionario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Funcionario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoFuncionarioRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.FuncionarioRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.UsuarioRepository;
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
public class FuncionarioBean {

    private Funcionario funcionario;

    private List<Funcionario> funcionarios;

    private List<Usuario> usuarios;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public void listar() {
        funcionarios = funcionarioRepository.findAll();
    }

    public void novo() {
        funcionario = new Funcionario();
        usuarios = usuarioRepository.findAll();
    }

    public void salvar() {
        try {
            funcionarioRepository.save(funcionario);
            Messages.addFlashGlobalInfo("Registro salvo com sucesso!");
        } catch (DataIntegrityViolationException excecao){
            excecao.printStackTrace();
            Messages.addFlashGlobalError("Essa Funcionario já existe!");
        }
    }

    public void selecionarExclusao(Funcionario cursor){
        Faces.setFlashAttribute("cursor", cursor);
        Faces.navigate("funcionario-exclusao.xhtml?faces-redirect=true");
    }
    public void selecionarEdicao(CargoFuncionario cursor){
        Faces.setFlashAttribute("cursor", cursor);
        Faces.navigate("funcionario-edicao.xhtml?faces-redirect=true");
    }

    public void carregar(){
        funcionario = Faces.getFlashAttribute("cursor");
    }

    public void excluir(){
        funcionarioRepository.delete(funcionario);
        Messages.addFlashGlobalInfo("Registro removido com sucesso!");
        Faces.navigate("funcionario-listagem.xhtml?faces-redirect=true");
    }
}

