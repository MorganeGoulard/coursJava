package tp_java_poo.exo_algo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        var taille=0;

        System.out.print("Combien de valeurs voulez vous dans votre tableau ? ");
        taille=input.nextInt();
        int [] tab= new int[taille];
        String [] caractere=new String[taille];


        for (int i = 0; i < taille; i++) {
            System.out.print("Saisir la valeur "+i+" : ");
            tab[i]= input.nextInt();
            caractere[i]=tab[i]+"";
            }

        int max=tab[0];
        int min=tab[0];
        for (int i = 0; i < taille; i++) {
            if (tab[i] > max) {
                max = tab[i];
                caractere[i]=tab[i]+" [PG] ";
            } else if (tab[i] < min) {
                min = tab[i];
                caractere[i]=tab[i]+" [PP] ";
            }
        }


        System.out.println(Arrays.toString(caractere));
        System.out.println("le plus grand nombre est : "+max);
        System.out.println("le plus petit nombre est : "+min);






    }
}
