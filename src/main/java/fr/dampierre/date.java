package fr.dampierre;

import java.util.Scanner;

import javax.lang.model.element.TypeElement;

public class date {
    
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien d'heures ? ");
        int heures = clavier.nextInt();
        System.out.println("Combien de minutes ? ");
        int minutes = clavier.nextInt();
        System.out.println("Combien de secondes ? ");
        int secondes = clavier.nextInt();

        int calc = (24 * 60 * 60) - ((heures * 60 * 60) + (minutes * 60) + secondes);

        System.out.println(calc);


    }

}
