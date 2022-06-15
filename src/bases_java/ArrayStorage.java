package bases_java;

import java.util.Arrays;

public class ArrayStorage {
    public static void main(String[] args) {

        int [] a=new int[5];
        // quand on crée un tab d'int/byte/short, java initialise toutes les cellules par 0
        // pour tab float/doubles, java initialise toutes les cellules par 0,0
        // Tab de booléens, toutes les cellules par FALSE
        // pout tab de String, java initialise toutes les cellules par NULL
        // Null => un objet qui ne pointe vers rien

        System.out.println("Affichage de l'adresse stockée dans a ");
        System.out.println(a);

        System.out.println();
        System.out.println("Affichage du tableau: "+ Arrays.toString(a));
    }
}
