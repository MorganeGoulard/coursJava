package Exercices_baseJava;

import java.util.Scanner;

public class Exo17 {
    public static void main(String[] args) {

        /*Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, retourne la chaine inverse.
        Ex:
        Votre chaine : mamy
        Résultat : ymam*/

        Scanner input=new Scanner(System.in);
        System.out.print("Saisir votre texte : ");
        var chain=input.next();
        System.out.printf("Texte : %s\n",chain);
        String reverseChain = " ";
        for (int i = chain.length()-1; i >= 0; i--) {
            reverseChain=reverseChain+chain.charAt(i);
        }
        System.out.println(reverseChain);


        // méthode native
        /*StringBuilder reverseChain=new StringBuilder(chain);
        chain=reverseChain.reverse().toString();
        System.out.printf("Texte inversé : %s", chain);*/




    }
}
