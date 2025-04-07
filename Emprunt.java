import java.util.Date;
public class Emprunt {
    private Livre livre;
    private Lecteur lecteur;
    private Date dateEmprunt;
    private Date dateRetour;

    public Emprunt(Livre livre, Lecteur lecteur, Date dateEmprunt, Date dateRetour) {
        this.livre = livre;
        this.lecteur = lecteur;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    // Ajoute cette méthode pour éviter l'erreur
    public Livre getLivre() {
        return livre;

    }
}