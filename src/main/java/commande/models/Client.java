package commande.models;

import java.util.ArrayList;
import java.util.List;

/* import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column; */
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("CLIENT")
public class Client extends User{

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes  = new ArrayList<>(); 

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    
}
