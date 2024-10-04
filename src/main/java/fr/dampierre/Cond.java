package fr.dampierre;

import java.util.Scanner;

public class Cond {

    public static void demanderEntierEtAfficherParite() {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Choisi une nombre : ");
        int nb = clavier.nextInt();

        if(nb%2 == 0){
            System.out.println("le nombre est pair");
        }
        else{
            System.out.println("Le nombre est impair");
        }

    }

    public static void main(String[] args) {
         
        // exo byssextille
        // Scanner clavier = new Scanner(System.in);

        // System.out.println("Votre année de naissance : ");
        // int annee = clavier.nextInt();
        
        // if(annee%4 == 0) {
        //     System.out.println("L'année est byssextille ");
        // }
        // else {
        //     System.out.println("L'année n'est pas byssextille");
        // }

        // clavier.close();

        demanderEntierEtAfficherParite();
    }
}

