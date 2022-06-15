package exercice_poo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne("Morgane", "Goulard", "France", false, (byte)0 );
        Scanner input= new Scanner(System.in);
        System.out.println("Nom complet : "+personne.nomComplet());

        System.out.print("Votre prenom : ");
        personne.setFirstName(input.nextLine());
        System.out.print("Votre nom : ");
        personne.setLastName(input.nextLine());
        System.out.print("nationalite : ");
        personne.setPays(input.nextLine());
        System.out.print("Etat marital (marié/célibataire) : ");
        String isMarried=input.nextLine();
        if(isMarried.equalsIgnoreCase("marié")){
            personne.setMarried(true);
        }else{
            personne.setMarried(false);
        }
        System.out.print("Nombre d'enfants : ");
        personne.setNombreEnfants(input.nextByte());

        System.out.println("Nom complet : "+personne.nomComplet());
        System.out.println("Nationalite : "+personne.getPays());
        System.out.println("Etat marital : "+(personne.getMarried()?"marié":"célibataire"));//opérateur ternaire
        System.out.println("Nombre d'enfants : "+personne.getNombreEnfants());
    }
}
