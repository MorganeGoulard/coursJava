package Exercices_baseJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo21 {
    public static void main(String[] args) {
        //Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations
        // à partir du clavier.
        // Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite
        // retirer de liste.
        // Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.

        Scanner input=new Scanner(System.in);
        ArrayList<String> langages=new ArrayList<>();

        while(true) {
            System.out.print("Langage de programmation : ");
            var langage = input.nextLine();
            if (langage.isBlank()) {
                System.out.print("Vous avez rempli votre liste de langage avec succès!");
                break;
            }
            langages.add(langage);
        }

        System.out.println("Quels langages voulez-vous retirer? \n");
        System.out.println("Tableau avant suppression(s) "+langages);
        while(true){
            var supprLangage=input.nextLine();
            var langage ="";
            if (supprLangage.isBlank() && !langages.isEmpty()){
                break;
            } else if (langages.remove(supprLangage)){
            langages.remove(supprLangage);
            } else if (!langages.remove(supprLangage)) {
                System.out.printf("Le langage %d n'existe pas dans le tableau",supprLangage);
            }
        }
        System.out.println("Tableau après suppression(s) "+langages);

    }
}
