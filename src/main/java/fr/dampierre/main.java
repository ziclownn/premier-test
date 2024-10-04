package fr.dampierre;

import java.util.Scanner;
import  java.util.Random ;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        // init variables
        int n = r.nextInt(101);
        float nbc = 50;
        int essai = 0;

        // boucle while
        while (nbc != n) {
            essai += 1;

            System.out.println("Vous proposez: " + nbc + " ");

            if (nbc > n) {
                nbc = nbc/2;
                System.out.println("Trop grand !");
            } else if (nbc < n) {
                if(nbc%2 == 0){
                    nbc = nbc + (nbc/2);
                }        
                else{
                    nbc = (int)(nbc + (nbc/2) + 0.5);
                }      
                System.out.println("Trop petit !");
            } else {
                System.out.println("Vous avez trouvé !");
            }
        }
        System.out.println("Vous avez mis "+essai+" essai");
        }

    }