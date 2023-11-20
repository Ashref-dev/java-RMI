package Client;

import Interfaces.IEtudiant;
import Models.Etudiant;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {
        IEtudiant ie;
        ie = (IEtudiant) Naming.lookup("EtudiantObjet");
        Scanner scanner = new Scanner(System.in);


        System.out.println(ie.ajouterEtudiant(new Etudiant(1, "Maher", "Abderrahim", 10, 15)));
        ie.ajouterEtudiant(new Etudiant(2, "Ahmed", "Attafi", 12, 17));
        ie.ajouterEtudiant(new Etudiant(3, "Tarek", "Msolli", 14, 16));

        // Renvoi moyenne
        System.out.println("Entrer le id de l edtudiant: ");
        int number = scanner.nextInt();
        System.out.println("La moyenne de l'étudiant d'id " + number + " est de " + ie.renvoyerMoyenne(number));

        // Recherche meilleur etudiant
        Etudiant meilleur = ie.rechercherMeilleur();
        System.out.println("L'étudiant ayant la meilleure moyenne est " + meilleur.getNom() + " " + meilleur.getPrenom() + " avec une moyenne de " + meilleur.moyenne());
    }
}