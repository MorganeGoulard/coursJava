package tp_validation_acquis;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.StringJoiner;

public class exo5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ecrire une phrase : ");
        var str = input.nextLine();


        HashMap<Integer, Character> hmStr = new LinkedHashMap<>();

        System.out.println("texte avant supression doublon : '"+str+" '");
        var occurence = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                hmStr.put(i,str.charAt(i));
            } else if (str.charAt(i) == str.charAt(i+1)){
                hmStr.remove(i);
                hmStr.remove((i+1));
                occurence = occurence+1;
            }
        }

        for (int i = 0; i < hmStr.size()-1; i++) {
            System.out.print(hmStr.get(i));
        }

        System.out.println("\nnombre de doublon = "+occurence);

    }
}
