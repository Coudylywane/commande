package commande.dao;

import java.util.List;

import javax.persistence.EntityManager;


import commande.models.Client;

public class ClientDaoImp implements IClientDao{

    @Override
    public boolean save(Client t) {
        EntityManager em = PersistanceDao.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            em.getTransaction().rollback();
            em.close();
            return false;
        }
    }

    @Override
    public boolean delete(Client t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Client t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Client findById(Long s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Client> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
