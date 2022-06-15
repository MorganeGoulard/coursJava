package exercice_poo_imc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Patient patient1=new Patient();

        System.out.print("Prenom patient : ");
        patient1.setFirstName(input.nextLine());
        System.out.print("nom patient : ");
        patient1.setLastName(input.nextLine());
        System.out.print("Taille patient : ");
        patient1.setTaille(input.nextDouble());
        System.out.print("Poids patient : ");
        patient1.setPoids(input.nextDouble());

        System.out.println();
        System.out.println("Prenom : "+patient1.getFirstName());
        System.out.println("Nom : "+patient1.getLastName());
        System.out.println("Taille : "+patient1.getTaille());
        System.out.println("Poids : "+patient1.getPoids());
        System.out.println("L'IMC du patient est : "+patient1.calculIMC());

    }
}
