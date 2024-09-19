package fr.dampierre;

import java.util.Scanner;

public class zez {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Quel est le premier nom commun?");
        String NOM1 = clavier.next();

        System.out.println("Quel est le deuxième nom commun?");
        String NOM2 = clavier.next();

        System.out.println("Quel est l'adjectif?");
        String ADJ = clavier.next();

        System.out.println("Quel est le nombre du truc?");
        String nombre = clavier.next();

        System.out.println("Il était une fois un " + NOM1 + " qui avait " + nombre + " " + NOM2 + ". Cela le rendait très " + ADJ + ".");

        clavier.close();
    }
}
