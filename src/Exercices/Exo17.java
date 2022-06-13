package Exercices;

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
        StringBuilder reverseChain=new StringBuilder(chain);
        chain=reverseChain.reverse().toString();
        System.out.printf("Texte inversé : %s", chain);




    }
}
