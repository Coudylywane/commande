package commande.service;

import commande.dao.IRoleDao;
import commande.dao.RoleDaoImp;
import commande.models.Role;

public class RoleService {
    
    private IRoleDao iRoleDao ;

    public RoleService(){
        iRoleDao = new RoleDaoImp();
    }

    public boolean ajoutRole(Role role){
       return iRoleDao.save(role);
    }
}
