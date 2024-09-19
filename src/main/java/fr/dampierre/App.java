package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // String prenom = "Léo";
        // System.out.println("Bonjour" + " " + prenom + " !");
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrer le salaire horaire :");
        int salaireH = clavier.nextInt();

        System.out.println("Entrer le nombre d'heures travaillés :");
        int nbHeure = clavier.nextInt();

        int brut = salaireH * nbHeure;

        System.out.println("Salaire Brut : " + brut);
        clavier.close();
    }
    
}
