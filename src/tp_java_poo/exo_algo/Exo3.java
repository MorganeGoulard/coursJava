package tp_java_poo.exo_algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        // demander à l'utilisateur de rentrer les textes à comparer
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer une chaine de caracteres : ");
        var str1 = input.nextLine();
        System.out.print("Entrer une 2eme chaine de caractères : ");
        var str2 = input.nextLine();

        // créer des hashmap à partir des string
        // prendre que des minuscules et ne pas prendre les espaces
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();

        HashMap<Character, Integer> hmStr1 = new HashMap<>();
        HashMap<Character, Integer> hmStr2 = new HashMap<>();

        if (str1.length() != str2.length()) {
            System.out.println("Les 2 chaines de caracteres ne sont pas des anagrammes");
        } else {
            for (int i = 0; i < str1.length(); i++) {
                var key = str1.charAt(i);
                var occurence = 0;
                if (hmStr1.get(key) == null) {
                    hmStr1.put(key, 1);
                } else {
                    hmStr1.put(key, occurence);
                }
            }


            for (int i = 0; i < str2.length(); i++) {
                var caractere = str2.charAt(i);
                var occurence = 0;
                if (hmStr2.get(caractere) == null) {
                    hmStr2.put(caractere, 1);
                } else {
                    hmStr2.put(caractere, occurence);
                }
            }

            if(hmStr1.equals(hmStr2)){
                System.out.println("les 2 chaines de caracteres sont des anagrammes");
            } else {
                System.out.println("Les 2 chaines de caracteres ne sont pas des anagrammes");
            }
        }

    }

}

