import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Livre> bibliotheque = new ArrayList<>();
    private static List<Emprunt> emprunts = new ArrayList<>();
    private static Bibliothecaire bibliothecaire = new Bibliothecaire("Alice", "alice@example.com");
    private static Lecteur lecteur = new Lecteur("Bob", "bob@example.com");
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        do {
            afficherMenu();
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    ajouterLivre();
                    break;
                case 2:
                    listerLivres();
                    break;
                case 3:
                    emprunterLivre();
                    break;
                case 4:
                    retournerLivre();
                    break;
                case 5:
                    supprimerLivre();
                    break;
                case 6:
                    System.out.println("Merci d'avoir utilisé notre bibliothèque !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 6);
    }
    private static void afficherMenu() {
        System.out.println("\n===== MENU BIBLIOTHÈQUE =====");
        System.out.println("1. Ajouter un livre");
        System.out.println("2. Lister les livres");
        System.out.println("3. Emprunter un livre");
        System.out.println("4. Retourner un livre");
        System.out.println("5. Supprimer un livre");
        System.out.println("6. Quitter");
    }

    private static void ajouterLivre() {
        System.out.print("Titre du livre : ");
        String titre = scanner.nextLine();
        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();
        System.out.print("ISBN : ");
        String ISBN = scanner.nextLine();
        System.out.print("Année de publication : ");
        int anneePub = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne
        Livre livre = new Livre(titre, auteur, ISBN, anneePub);
        bibliotheque.add(livre);
        System.out.println("Livre ajouté avec succès !");
    }

    private static void listerLivres() {
        if (bibliotheque.isEmpty()) {
            System.out.println("Aucun livre disponible.");
            return;
        }
        System.out.println("\n===== LIVRES DISPONIBLES =====");
        for (int i = 0; i < bibliotheque.size(); i++) {
            System.out.println((i + 1) + ". " + bibliotheque.get(i).getTitre());
        }
    }
    private static void emprunterLivre() {
        if (bibliotheque.isEmpty()) {
            System.out.println("Aucun livre disponible à emprunter.");
            return;
        }
        listerLivres();
        System.out.print("Choisissez le numéro du livre à emprunter : ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consommer le retour à la ligne
        if (index >= 0 && index < bibliotheque.size()) {
            Livre livre = bibliotheque.get(index);
            bibliotheque.remove(index);
            Emprunt emprunt = new Emprunt(livre, lecteur, new Date(), null);
            emprunts.add(emprunt);
            System.out.println("Livre emprunté avec succès !");
        } else {
            System.out.println("Numéro invalide.");
        }
    }
    private static void retournerLivre() {
        if (emprunts.isEmpty()) {
            System.out.println("Aucun livre emprunté.");
            return;
        }
        System.out.println("\n===== LIVRES EMPRUNTÉS =====");
        for (int i = 0; i < emprunts.size(); i++) {
            System.out.println((i + 1) + ". " + emprunts.get(i).getLivre().getTitre());
        }
        System.out.print("Choisissez le numéro du livre à retourner : ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consommer le retour à la ligne

        if (index >= 0 && index < emprunts.size()) {
            Livre livre = emprunts.get(index).getLivre();
            emprunts.remove(index);
            bibliotheque.add(livre);
            System.out.println("Livre retourné avec succès !");
        } else {
            System.out.println("Numéro invalide.");
        }
    }

    private static void supprimerLivre() {
        if (bibliotheque.isEmpty()) {
            System.out.println("Aucun livre disponible à supprimer.");
            return;
        }
        listerLivres();
        System.out.print("Choisissez le numéro du livre à supprimer : ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consommer le retour à la ligne

        if (index >= 0 && index < bibliotheque.size()) {
            Livre livre = bibliotheque.remove(index);
            System.out.println("Livre '" + livre.getTitre() + "' supprimé avec succès !");
        } else {
            System.out.println("Numéro invalide.");

        }

    }
}
