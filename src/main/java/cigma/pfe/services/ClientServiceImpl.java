package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.dao.*;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL par Constructor");
        this.clientRepository = clientRepository;
    }



    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    public Client modify(Client c) {
        return clientRepository.update(c);
    }

    public void removeById(long id) {
        clientRepository.deleteById(id);
    }

    public Client getById(long id) {
        return clientRepository.findById(id);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }


    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }
}