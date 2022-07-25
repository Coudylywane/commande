package commande.dao;

import java.util.List;

import javax.persistence.EntityManager;

import commande.models.Role;

public class RoleDaoImp implements IRoleDao{

    @Override
    public boolean save(Role t) {
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
    public boolean delete(Role t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Role t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Role findById(Long s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Role> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
