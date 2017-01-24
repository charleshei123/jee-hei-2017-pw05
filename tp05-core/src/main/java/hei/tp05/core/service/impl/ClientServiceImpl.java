package hei.tp05.core.service.impl;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;
import hei.tp05.core.dao.ClientDAO;
import hei.tp05.core.entity.Client;
import hei.tp05.core.service.ClientService;

@Named
@Transactional
public class ClientServiceImpl implements ClientService {

    @Inject
    private ClientDAO clientDAO;


    @Override
    public List<Client> findByNom(String nom) {
        return clientDAO.findByNom(nom);
    }


    @Override
    public void saveClient(Client client) {
        clientDAO.save(client);
    }


    @Override
    public List<Client> findAll() {
        return clientDAO.findAll();
    }


    @Override
    public List<Client> findAllWithCommandes() {
        List<Client> clients = clientDAO.findAllWithCommandes();
        return clients;
    }


    @Override
    public void deleteClient(long idClient) {
        clientDAO.delete(idClient);
    }
}
