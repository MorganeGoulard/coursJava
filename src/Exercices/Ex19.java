package Exercices;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        /*Ecrire un programme java qui demande à l'utilisateur de remplir
        une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale
         */

        Scanner input=new Scanner(System.in);
        int matrice [][]=new int[4][4];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length ; j++) {
                System.out.printf("matrice [%d][%d] : ", i, j);
                matrice[i][j] = input.nextInt();
            }
        }

        var sum = 0;
        for (int i = 0; i < matrice.length; i++) {
            sum=sum+matrice[i][i];
        }

        System.out.printf("Somme de la diagonale = %d",sum);

        




    }
}
