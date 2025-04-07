public class Magazine extends Livre {
    private String frequencePub;
    private String editeur;

    public Magazine(String titre, String auteur, String ISBN, int anneePub, String frequencePub, String editeur) {
        super(titre, auteur, ISBN, anneePub);
        this.frequencePub = frequencePub;
        this.editeur = editeur;

    }
}
