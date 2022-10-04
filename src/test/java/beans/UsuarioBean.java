package beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.UsuarioRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Data
@Component
@ViewScoped
public class UsuarioBean {

    private Usuario usuario;

    private List<Usuario> usuarios;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void listar() {
        usuarios = usuarioRepository.findAll();
    }
}

