public class Utilisateur {
    protected String nom;
    protected String email;

    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public void seConnecter() {
        System.out.println(nom + " s'est connecté.");
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;

    }
}