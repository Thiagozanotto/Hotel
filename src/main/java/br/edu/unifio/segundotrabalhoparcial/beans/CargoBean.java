package br.edu.unifio.segundotrabalhoparcial.beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoRepository;
import lombok.Data;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
    public void novo() { cargo = new Cargo(); }

    public void salvar() {
        try {
            cargoRepository.save(cargo);
            Messages.addFlashGlobalInfo("Registro salvo com sucesso!");
            Faces.navigate("cargo-listagem.xhtml?faces-redirect=true");
        } catch (DataIntegrityViolationException excecao){
            excecao.printStackTrace();
            Messages.addFlashGlobalError("Esse Cargo já existe!");
        }
    }

}
