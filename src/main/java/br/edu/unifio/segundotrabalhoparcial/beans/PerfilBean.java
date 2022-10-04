package br.edu.unifio.segundotrabalhoparcial.beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Perfil;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.PerfilRepository;
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
public class PerfilBean {
    private Perfil perfil;

    private List<Perfil> perfis;

    @Autowired
    private PerfilRepository perfilRepository;

    public void listar() { perfis = perfilRepository.findAll(); }

    public void novo() { perfil = new Perfil();}

    public void salvar() {
        try {
            perfilRepository.save(perfil);
            Messages.addFlashGlobalInfo("Registro salvo com sucesso!");
            Faces.navigate("perfil-listagem.xhtml?faces-redirect=true");
        } catch (DataIntegrityViolationException excecao){
            excecao.printStackTrace();
            Messages.addFlashGlobalError("Esse Perfil já existe!");
        }

    }
}

