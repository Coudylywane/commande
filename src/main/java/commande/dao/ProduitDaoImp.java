package commande.dao;

import java.util.List;

import javax.persistence.EntityManager;

import commande.models.Produit;

public class ProduitDaoImp implements IProduitDao{

    @Override
    public boolean save(Produit t) {
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
    public boolean delete(Produit t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Produit t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Produit findById(Long s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produit> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    

   
    
}
