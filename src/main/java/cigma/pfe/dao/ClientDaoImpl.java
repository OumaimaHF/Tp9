package cigma.pfe.dao;
import cigma.pfe.models.Client;

import javax.persistence.*;

public class ClientDaoImpl implements IClientDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();
    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }
    public ClientDaoImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }
}