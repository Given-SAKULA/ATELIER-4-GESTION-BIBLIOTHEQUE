public class Lecteur extends Utilisateur {
    public Lecteur(String nom, String email) {
        super(nom, email);
    }

    public void emprunterLivre(Livre livre) {
        System.out.println(nom + " a emprunté le livre : " + livre.getTitre());
    }

    public void retournerLivre(Livre livre) {
        System.out.println(nom + " a retourné le livre : " + livre.getTitre());

    }
}
