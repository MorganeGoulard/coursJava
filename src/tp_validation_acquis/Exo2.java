package tp_validation_acquis;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Saisir un nombre  : ");
        var nombre = input.nextInt();
        var nombreAbs=Math.abs(nombre);

        String nombreStr=String.valueOf(nombreAbs);
        var nombreInverse="";

        for (int i = nombreStr.length()-1; i >=0 ; i--) {
            nombreInverse=nombreInverse+nombreStr.charAt(i);
        }

        if(nombre>=0){
            System.out.println("nombre inverse : "+nombreInverse);
        } else if (nombre<0) {
            System.out.println("nombre inverse : -"+nombreInverse);
        }

    }
}
