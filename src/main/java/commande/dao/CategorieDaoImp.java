package commande.dao;

import java.util.List;

import javax.persistence.EntityManager;

import commande.models.Categorie;

public class CategorieDaoImp implements ICategorieDoa{

    @Override
    public boolean save(Categorie t) {
        EntityManager em = PersistanceDao.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e.getMessage());
            em.close();
            return false;
        }
    }

    @Override
    public boolean delete(Categorie t) {
        EntityManager em = PersistanceDao.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e.getMessage());
            em.close();
            return false;
        }
    }

    @Override
    public boolean update(Categorie t) {
        EntityManager em = PersistanceDao.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e.getMessage());
            em.close();
            return false;
        }
    }

    @Override
    public Categorie findById(Long s) {
        EntityManager em = PersistanceDao.getEntityManager();
        return em.createQuery("SELECT ca FROM Categorie ca WHERE ca.id=:id", Categorie.class)
        .setParameter("id", s)
        .getSingleResult();
    }

    @Override
    public List<Categorie> findAll() {
        EntityManager em = PersistanceDao.getEntityManager();
        return em.createQuery("SELECT ca FROM Categorie ca", Categorie.class).getResultList();
    }
    
}
