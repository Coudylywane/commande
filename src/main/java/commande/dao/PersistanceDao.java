package commande.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import commande.models.User;


public class PersistanceDao {
    private static EntityManagerFactory emf;

    private PersistanceDao(){
        emf = Persistence.createEntityManagerFactory("userPU");
    }

    public static EntityManager getEntityManager(){
        if (emf == null) {
            new PersistanceDao();
        }

        return emf.createEntityManager();
    }

    public static void creerTable(){
        EntityManager em = getEntityManager();
        em.createQuery("SELECT u FROM User u" , User.class).getResultList();
    }

    public static void closeEntityManagerFactory(){
        emf.close();
    }

}
