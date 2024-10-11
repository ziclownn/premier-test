package fr.dampierre;

import  java.util.Random ;

public class exo_dichotomie {

    public static void main(String[] args) {

        Random r = new Random();

        // init variables
        int n = r.nextInt(101);
        int essai = 0;
        int max = 100;
        int min = 0;
        int milieu = 50;

        // boucle while
        while (milieu != n) {
            essai += 1;

            System.out.println("Vous proposez: " + milieu + " ");

            if(milieu > n) {
                max = milieu;
                System.out.println("trop grand !");
                milieu = (min + max)/2;
            } 
            else if(milieu < n) {
                min = milieu;
                System.out.println("trop petit !");
                milieu = (min+max)/2;
            }
        }
        System.out.println("Vous avez trouver en "+essai+" essais ! Le chiffre était : " + n);
    }

        
}