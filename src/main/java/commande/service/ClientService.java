package commande.service;

import commande.dao.ClientDaoImp;
import commande.dao.IClientDao;
import commande.models.Client;

public class ClientService {
    private IClientDao iClientDao;

    public ClientService(){
        iClientDao = new ClientDaoImp();
    }

    public boolean ajoutClient(Client client){
        return iClientDao.save(client);
    }
}
