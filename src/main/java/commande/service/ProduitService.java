package commande.service;

import commande.dao.IProduitDao;
import commande.dao.ProduitDaoImp;
import commande.models.Produit;

public class ProduitService {
    private IProduitDao iProduitDao;

    public ProduitService(){
        iProduitDao = new ProduitDaoImp();
    }

    public boolean ajoutProduit(Produit produit) {
        return iProduitDao.save(produit);
    }
}
