package commande;

import java.util.Scanner;


import commande.dao.PersistanceDao;
import commande.models.Adresse;
import commande.models.Client;
import commande.models.Role;
import commande.service.CategorieService;
import commande.service.ClientService;
import commande.service.ProduitService;
import commande.service.RoleService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersistanceDao.creerTable();
        Scanner scanner = new Scanner(System.in);
        CategorieService categorieService = new CategorieService();
        ProduitService produitService = new ProduitService();
        ClientService clientService = new ClientService();
        RoleService roleService = new RoleService();
        
        

        /* Categorie categorie = new Categorie();
        System.out.println("Entrer le nom de la categorie");
        categorie.setNom(scanner.nextLine());

        categorieService.ajoutCategorie(categorie); */

    /*  Produit produit = new Produit(); 

            System.out.println("Entrer le nom du produit");
            produit.setNom(scanner.nextLine());

            System.out.println("Entrer le prix du produit");
            produit.setPrix(scanner.nextInt());

            System.out.println("Entrer le numero du produit");
            produit.setNumero(scanner.nextInt());

            List<Categorie> categories = categorieService.findAllCategorie();
            for(Categorie ca : categories) {
            System.out.println("########## ID " + ca.getId() + " #################");
            System.out.println("Nom Complet : " + ca.getNom());
            
            }

            System.out.println("Choisir l'id du categorie");
            Long id = scanner.nextLong();
            Categorie categorie1 = categorieService.findCategorieById(id);
            produit.setCategorie(categorie1);
            if (categorie1.getId() != null) {
                produitService.ajoutProduit(produit);
            }else{
                System.out.println("ERREUR");œœ
            } */


            Client client = new Client(); 
                client.setEmail("wanecoudy@gmail.com");
                client.setNom("wane");
                client.setPrenom("coudy");
                client.setPassword("password");
                    Adresse adresse = new Adresse();
                        adresse.setNumTel("781719525");
                        adresse.setQuartier("Ouest foire");
                        adresse.setVille("Dakar");

                client.setAdresse(adresse);
                    Role role = new Role();
                    role.setId(1L);
                    role.setLibelle("client");
                client.setRole(role);
                clientService.ajoutClient(client);

              

        PersistanceDao.closeEntityManagerFactory();

    }
}
