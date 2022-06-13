package Cours;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemplissageTableauMultiDim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Donnez nombre de lignes : ");
        int nombreLigne=input.nextInt();
        // [0][0] => 4
        // [0][1] => 3
        // [0][2] => 5
        int [][] matrice=new int[nombreLigne][];
        for (int i = 0; i < matrice.length; i++) {
            System.out.printf("Donnez le nombre de colonne pour la ligne[%d] : ",i);
            int nombreColonne=input.nextInt();
            matrice[i]=new int[nombreColonne];
            for (int j = 0; j < matrice[i].length ; j++) {
                System.out.printf("matrice [%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }

        System.out.println("Affichage de tout le tableau");
        for (int i = 0; i < matrice.length ; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
