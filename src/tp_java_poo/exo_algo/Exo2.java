package tp_java_poo.exo_algo;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Saisir un nombre  : ");
        var nombre = input.nextInt();

        String nombreStr=String.valueOf(nombre);
        var nombreInverse="";
        for (int i = nombreStr.length()-1; i >=0 ; i--) {
            nombreInverse=nombreInverse+nombreStr.charAt(i);
        }
        System.out.println("nombre inverse : "+nombreInverse);

    }
}
