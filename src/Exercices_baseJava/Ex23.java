package Exercices_baseJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        /* Ecrire un programme Java qui permet à l'utilsation de déclarer 2 tableaux:
            - 1 tableau correspondant au numéro du jour de la semaine(ex : 1 pour Lundi)
            - 1 tableau correspondant au nom des jours de la semaine(Ex : Lundi)
            - Associer les 2 informations dans un HashMap
        Permettre à l'utilisation d'associer via un HasMap le numéro correspondant au jour et le jour de la semaine correspondant.

        Pour les jours de la semaine et le numéros correspondant, veuillez stocker les données dans des Set(recherche sur internet)
         */

        Scanner input = new Scanner(System.in);
        ArrayList<String> joursSemaine= new ArrayList<>();
        ArrayList<Integer> numeroJour=new ArrayList<>();

        System.out.println("Veuillez entrer les jours de la semaine : ");
        for (int i = 0; i < 7; i++) {
            System.out.print("Jour de la semaine : ");
            var jour = input.nextLine();
            joursSemaine.add(jour);
        }

        System.out.println("Entrez le numéro du jour ");

        for (int i = 0; i < 7; i++) {
            System.out.print("Numéro du jour de " + joursSemaine.get(i) + " : ");
            var numero = input.nextInt();
                numeroJour.add(numero);
        }

        System.out.println("Vous avez rempli avec succès vos 2 tableaux ");
        System.out.println("Tableau des jours de la semaine : "+joursSemaine);
        System.out.println("Tableau des numéros des jours : "+numeroJour);

        HashMap<Integer,String> semaine= new HashMap<>();

        for (int i = 0; i < numeroJour.size(); i++) {
            int key=numeroJour.get(i);
            String value=joursSemaine.get(i);
            semaine.put(key,value);

        }

        System.out.println();
        System.out.println(semaine);
        System.out.println();

        System.out.println("Saississez un numéro : ");

        var key = input.nextInt();
        var value = semaine.get(key);

        System.out.printf("Le jour de la semaine dont le nombre est %d est %s : ",key,value);

    }

}