package hei.tp05.contract.facade;

import hei.tp05.contract.dto.ClientDTO;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface ClientWS {

    List<ClientDTO> getAllClients();

    void saveClient(ClientDTO clientDTO);

}
