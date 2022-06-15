package exercice_poo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne();
        Scanner input= new Scanner(System.in);

        System.out.print("Votre nom : ");
        personne.lastName = input.nextLine();
        System.out.print("Votre prenom : ");
        personne.firstName = input.nextLine();
        System.out.print("nationalite : ");
        personne.pays = input.nextLine();
        System.out.print("Etat marital (marié/célibataire) : ");
        String isMarried=input.nextLine();
        if(isMarried.equalsIgnoreCase("marié")){
            personne.married=true;
        }else{
            personne.married=false;
        }
        System.out.print("Nombre d'enfants : ");
        personne.nombreEnfants=input.nextByte();

        System.out.println("Votre nom complet est : "+personne.nomComplet());
        System.out.println("Nationalite : "+personne.pays);
        System.out.println("Etat marital : "+(personne.married?"marié":"célibataire"));
        System.out.println("Nombre d'enfants : "+personne.nombreEnfants);
    }
}
