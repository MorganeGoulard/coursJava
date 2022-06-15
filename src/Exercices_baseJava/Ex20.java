package Exercices_baseJava;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

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
            sum=sum+(matrice[i][i])+(matrice[matrice.length-i-1][i]);
        }

        System.out.printf("Somme des diagonales = %d",sum);
    }
}
