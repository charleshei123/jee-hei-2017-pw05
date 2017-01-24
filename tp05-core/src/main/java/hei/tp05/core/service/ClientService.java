package hei.tp05.core.service;

import java.util.List;
import hei.tp05.core.entity.Client;

public interface ClientService {

    List<Client> findByNom(String nom);


    void saveClient(Client client);


    List<Client> findAll();


    List<Client> findAllWithCommandes();


    void deleteClient(long idClient);
}
