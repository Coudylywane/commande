package commande.service;

import java.util.List;

import commande.dao.CategorieDaoImp;
import commande.dao.ICategorieDoa;
import commande.models.Categorie;

public class CategorieService {
    
    private ICategorieDoa iCategorieDoa;

    public CategorieService(){
        iCategorieDoa = new CategorieDaoImp();
    }

    public boolean ajoutCategorie(Categorie categorie){
        return iCategorieDoa.save(categorie);
    }

    public Categorie findCategorieById(Long id){
        return iCategorieDoa.findById(id);
    }
    
    public List<Categorie> findAllCategorie(){
        return iCategorieDoa.findAll();
    }


}
