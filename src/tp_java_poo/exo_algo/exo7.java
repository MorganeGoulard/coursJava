package tp_java_poo.exo_algo;

import java.util.Scanner;

public class exo7 {

    public static char [] majAlternee(char [] tabCaractere){
        var tabCaractere2 = new char[tabCaractere.length];
        for (int i = 0; i < tabCaractere.length; i++) {
            if(i %2 == 0){
                tabCaractere2[i] = Character.toUpperCase(tabCaractere[i]);
            } else {
                tabCaractere2[i]= Character.toLowerCase(tabCaractere[i]);
            }
        }
        return tabCaractere2;
    }

    public static void main(String[] args) {

        char [] tabEx  = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(tabEx));
        System.out.println(majAlternee(tabEx));


        /* méthode triche

        char[] tabCara = {'a', 'b', 'c', 'd', 'e'};
        char[] tabCara2 = tabCara;

        for (int i = 0; i <= 5; i=i+2) {
            tabCara2[i] = Character.toUpperCase(tabCara2[i]);
        }

        System.out.println(tabCara2);*/

    }
}
