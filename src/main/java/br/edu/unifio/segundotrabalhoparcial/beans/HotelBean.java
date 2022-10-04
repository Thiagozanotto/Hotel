package br.edu.unifio.segundotrabalhoparcial.beans;

import br.edu.unifio.segundotrabalhoparcial.entidades.Cargo;
import br.edu.unifio.segundotrabalhoparcial.entidades.Hotel;
import br.edu.unifio.segundotrabalhoparcial.entidades.Usuario;
import br.edu.unifio.segundotrabalhoparcial.repositorios.CargoRepository;
import br.edu.unifio.segundotrabalhoparcial.repositorios.HotelRepository;
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
public class HotelBean {

    private Hotel hotel;

    private List<Hotel> hoteis;

    @Autowired
    private HotelRepository hotelRepository;

    public void listar() { hoteis = hotelRepository.findAll();}

    public void novo() { hotel = new Hotel();}

    public void salvar() {
        try {
            hotelRepository.save(hotel);
            Messages.addFlashGlobalInfo("Registro salvo com sucesso!");
            Faces.navigate("hotel-listagem.xhtml?faces-redirect=true");
        } catch (DataIntegrityViolationException excecao){
            excecao.printStackTrace();
            Messages.addFlashGlobalError("Esse Hotel já existe!");
        }


    }
}

