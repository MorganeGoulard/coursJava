package Exercices;

import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {

        /*Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).
         Ex :
         Entrez un text : non
         Résultat : non est un palindrome
         Entrez un text : oui
         Résultat : oui n'est pas un palindrome*/

        Scanner input=new Scanner(System.in);
        System.out.print("Saisir un texte : ");
        var str=input.next();
        System.out.printf("Texte : %s\n",str);
        String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr=reverseStr+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverseStr)){
            System.out.printf("%s est un palindrome.",str);
        }else{
            System.out.printf("%s n'est pas un palindrome",str);
        }



    }
}
