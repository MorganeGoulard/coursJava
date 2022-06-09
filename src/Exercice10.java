import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        System.out.println("Table de multiplication");

        var input=new Scanner(System.in);
        System.out.print("A partir de la table ");
        var firstTable=input.nextInt();
        System.out.print("Jusqu'à la table ");
        var lastTable=input.nextInt();
        System.out.print("Valeur de début : ");
        var start=input.nextInt();
        System.out.print("Valeur de fin");
        var end=input.nextInt();


        for(int table=firstTable;table<=lastTable;table +=1){
            for(int i=start;i<=end;i +=1){
                System.out.printf("%d x %d = %d\n",table,i,(table*i));
            }
        }

    }
}
