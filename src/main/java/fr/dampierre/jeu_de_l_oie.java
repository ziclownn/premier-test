package fr.dampierre;
import java.util.Random;

public class jeu_de_l_oie {
    
    public static void main(String[] args) {
        int caseObjectif = 20;
        int nbLancers = 5;
        boolean win = false;
        int essais = 0;
        Random rand = new Random();

        System.out.println("Bienvenue ! Commençons ...");

        while (win == false) {

            int caseCourante = 0;
            essais += 1;
            
            System.out.println("Partie n°"+ essais);

            for (int i = 1; i <= nbLancers; i++) {
                int lancers = rand.nextInt(6) + 1;
                caseCourante = caseCourante +lancers;
                System.out.println(String.format("Lancers %d : vous avez fait %d. Vous êtes sur la case %d.", i, lancers, caseCourante));
            };

            if (caseCourante == caseObjectif) {
                System.out.println("Vous avez gagné !");
                win = true;
            } else if (caseCourante > caseObjectif) {
                System.out.println("Vous dépassez, vous avez perdu !");
            } else {
                System.out.println("Il vous manque pour arriver à " + caseObjectif + " !");
            }

        };

        System.out.println(String.format("Vous avez réussi à gagner en %d essai(s)", essais));
    }
}
