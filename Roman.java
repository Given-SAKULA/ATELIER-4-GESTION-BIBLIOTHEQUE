public class Roman extends Livre {
    private String genre;
    private int nbChap;

    public Roman(String titre, String auteur, String ISBN, int anneePub, String genre, int nbChap) {
        super(titre, auteur, ISBN, anneePub);
        this.genre = genre;
        this.nbChap = nbChap;

    }
}
