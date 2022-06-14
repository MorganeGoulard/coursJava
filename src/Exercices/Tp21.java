package Exercices;

import java.util.HashMap;
import java.util.Scanner;

public class Tp21 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Combien de langages souhaitez-vous ajouter? ");
        int nbLg=input.nextInt();

        input.nextLine();
        HashMap<String,String> langages=new HashMap<>();
        for (int i = 1; i <= nbLg; i++) {
            if(i==1){
                System.out.printf("Insérer le %der : ",i);
            }else{
                System.out.printf("Insérer le %dème langage : ",i);
            }
            String langage=input.nextLine();
            langages.put(langage,langage);
        }
        System.out.println(langages);

        System.out.println("Quel langage voulez-vous supprimer? ");
        String langageSuppr=input.nextLine();
        langages.remove(langageSuppr);

        System.out.println("Après la suppression");
        System.out.println(langages);


    }
}
