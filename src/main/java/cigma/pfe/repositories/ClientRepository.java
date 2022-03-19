package cigma.pfe.repositories;
import cigma.pfe.models.Client;

public interface ClientRepository {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);
    List<Client> findAll();

}