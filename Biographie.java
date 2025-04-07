public class Biographie extends Livre {
    private String personneConcernee;

    public Biographie(String titre, String auteur, String ISBN, int anneePub, String personneConcernee) {
        super(titre, auteur, ISBN, anneePub);
        this.personneConcernee = personneConcernee;

    }
}
