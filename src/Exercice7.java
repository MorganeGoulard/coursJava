import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {

        // demander à l'utilisateur d'entrer un nombre entier
        // afficher s'il est positif, négatif, 0, pair ou impair

        Scanner input=new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre=input.nextInt();
        var estPair=nombre%2==0;

        if(nombre>0){
            System.out.print("Le nombre est positif");
        }else if(nombre<0) {
            System.out.print("Le nombre est négatif");
        }else {
            System.out.print("le nombre est nul");
        }

        System.out.printf(" et est %s",estPair?" pair" : " impair");

    }
}
