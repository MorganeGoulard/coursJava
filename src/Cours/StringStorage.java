package Cours;

import java.util.Scanner;

public class StringStorage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String nom="Jordan";
        String nom2="Jordan";
        if(nom==nom2){
            System.out.println("nom pointe vers le même string que nom2");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom2");
        }

        System.out.print("Entrez un nom : ");
        String nom3=input.nextLine();
        // ce test va être évalué à FALSE
        // car les strings fournis à partir du clavier ne sont pas stockés dans
        // pool des littéraux
        System.out.println();
        System.out.print("Test avant d'avoir ajouter nom3 dans le pool des littéraux : ");
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }

        // Test des valeurs des 2 strings
        System.out.println();
        System.out.print("Tester les valeurs de 2 strings : ");
        if(nom.equals(nom3)){
            System.out.println("nom contient le même string que nom3");
        }else{
            System.out.println("nom ne contient pas le même string que nom3");
        }

        // Mettre le string stocké dans nom3 dans le pool des littéraux
        System.out.println();
        System.out.print("Test après avoir ajouter nom3 dans le pool des littéraux : ");
        nom3=nom3.intern();
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }
    }
}
