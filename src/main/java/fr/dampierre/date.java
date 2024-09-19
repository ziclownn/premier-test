package fr.dampierre;

import java.util.Scanner;

public class date {
    
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Quelle est votre année de naissance?");
        int annee = clavier.nextInt();

        float bissextile = annee / 4;

        if(bissextile == ) {
            System.out.println("Votre année de naissance est bissextile");
        }


    }

}
