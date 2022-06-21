package tp_validation_acquis;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo4 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Entrez votre phrase : ");
        var str = input.nextLine();
        char [] charStr = str.toCharArray();
        //ArrayList<Character> strArr= new ArrayList<>();

        // si un caractère à la position est un espace, mettre le caractère à la position i+1 en maj

        // version Mickaël
        boolean espace=true;
        for (int i = 0; i < str.length()-1; i++) {
            if (espace){
                charStr[i] = Character.toUpperCase(charStr[i]);
                espace=false;
            }
            if(charStr[i] == ' '){
                espace=true;
            }
        }

        System.out.println(charStr);

        // version initiale
        for (int i = 0; i < str.length()-1; i++) {
            if(charStr[i] == ' '){
                charStr[i+1]= Character.toUpperCase(charStr[i+1]);
            } else if (i==0) {
                charStr[i]= Character.toUpperCase(charStr[i]);
            }
        }

        System.out.println(charStr);

    }
}
