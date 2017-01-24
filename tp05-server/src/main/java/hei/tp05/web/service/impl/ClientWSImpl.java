package hei.tp05.web.service.impl;

import hei.tp05.contract.dto.ClientDTO;
import hei.tp05.contract.facade.ClientWS;
import hei.tp05.core.entity.Client;
import hei.tp05.core.service.ClientService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Named("clientWS")
@WebService(endpointInterface = "hei.tp05.contract.facade.ClientWS")
public class ClientWSImpl implements ClientWS {

    @Inject
    private ClientService clientService;

    @Override
    public List<ClientDTO> getAllClients() {
       List<ClientDTO> retour = new ArrayList<>();
       List<Client> clients = clientService.findAll();
       for (Client client:clients){
           retour.add(new ClientDTO(client.getNom(),client.getPrenom()));
       }
        return retour;
    }


    @Override
    public void saveClient(final ClientDTO clientDTO) {
        Client clientToSave = new Client(clientDTO.getNom(),clientDTO.getPrenom());
        clientService.saveClient(clientToSave);
    }
}
