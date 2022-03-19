package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();

    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        return null;

    }

    public Client update(Client c) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null ;
    }

    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }

    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

    public List<Client> findAll() {
        List<Client> ListClient = em.createQuery("select e from Client e").getResultList();
        return ListClient;
    }

    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }
}