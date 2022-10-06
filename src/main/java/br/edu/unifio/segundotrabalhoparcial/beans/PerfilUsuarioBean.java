package br.edu.unifio.segundotrabalhoparcial.beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Perfil;
import br.edu.unifio.segundotrabalhoparcial.entidades.PerfilUsuario;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.PerfilRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.PerfilUsuarioRepository;
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
public class PerfilUsuarioBean {

    private PerfilUsuario perfilUsuario;
    private List<PerfilUsuario> perfilUsuarios;
    private List<Usuario> usuarios;
    private List<Perfil> perfils;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PerfilRepository perfilRepository;
    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    public void listar() {
        perfilUsuarios = perfilUsuarioRepository.findAll();
    }

    public void novo() {
        perfilUsuario = new PerfilUsuario();
        usuarios = usuarioRepository.findAll();
        perfils = perfilRepository.findAll();
    }

    public void salvar() {
        try {
            perfilUsuarioRepository.save(perfilUsuario);
            Messages.addFlashGlobalInfo("Registro salvo com sucesso!");
            Faces.navigate("perfilUsuario-listagem.xhtml?faces-redirect=true");
        } catch (DataIntegrityViolationException excecao){
            excecao.printStackTrace();
            Messages.addFlashGlobalError("Esse Perfil de Usuario já existe!");
        }

    }
}

