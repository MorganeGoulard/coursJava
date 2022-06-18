package tp_java_poo.exo_algo;

import java.util.Scanner;

public class Exo9 {

    public static boolean rechercheCaractereIdentique(String chain){
        boolean reponse=false;
        for (int i = 0; i < chain.length()-1; i++) {
            if(chain.charAt(i) == chain.charAt(i+1)){
                reponse=true;
            }
        }
        return reponse;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Saisir un mot : ");
        var motTest=input.nextLine();

        System.out.println(rechercheCaractereIdentique(motTest));

    }


}
