package Exercices_baseJava;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        var input= new Scanner(System.in);
        System.out.println("Veuillez remplir le tableau");
        System.out.print("Combien de valeurs voulez-vous dans votre tableau? ");
        var valeurTab = input.nextInt();

        int [] tab = new int[valeurTab];

        for (int i = 0; i <= tab.length-1 ; i++) {
            System.out.printf("Valeur [%d] du tableau : ", i);
            tab[i] = input.nextInt();
        }

        System.out.print("Quel nombre souhaitez-vous rechercher ? ");
        var valeurRecherchee=input.nextInt();
        var nombreDeFois=0;

        for (int i = 0; i <=tab.length-1 ; i++) {
            if (tab[i] == valeurRecherchee) {
                nombreDeFois = nombreDeFois + 1;
            }
        }

        if(nombreDeFois==0){
            System.out.printf("Le nombre %d n'existe pas dans le tableau.\n",valeurRecherchee);
        } else {
            System.out.printf("Le nombre %d existe et se retrouve %d fois.",valeurRecherchee,nombreDeFois);
        }

    }
}
