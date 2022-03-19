package cigma.pfe.repositories;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class FactureRepositoryImpl implements FactureRepository {

    FactureService factureService;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public Facture create(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    public List<Facture> read() {
        List<Facture> ReadF = em.createQuery("select e from Facture e").getResultList();
        return ReadF;
    }

    public void deleteFactureById(long id) {
        em.getTransaction().begin();
        Facture clientInDataBase = em.find(Facture.class,id);
        em.remove(clientInDataBase);
        em.getTransaction().commit();

    }

    public Facture update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null ;
    }
}