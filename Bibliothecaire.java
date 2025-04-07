public class Bibliothecaire extends Utilisateur {
    public Bibliothecaire(String nom, String email) {
        super(nom, email);
    }

    public void ajouterLivre(Livre livre) {
        System.out.println("Le livre '" + livre.getTitre() + "' a été ajouté.");
    }

    public void supprimerLivre(Livre livre) {
        System.out.println("Le livre '" + livre.getTitre() + "' a été supprimé.");

    }
}
