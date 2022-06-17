package tp_java_poo.exo_algo;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {


        char[] tabCara = {'a', 'b', 'c', 'd', 'e'};
        char[] tabCara2 = tabCara;

        for (int i = 0; i <= 5; i=i+2) {
            tabCara2[i] = Character.toUpperCase(tabCara2[i]);
        }

        System.out.println(tabCara2);

    }
}
