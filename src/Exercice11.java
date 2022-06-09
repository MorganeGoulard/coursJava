import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {

        var input=new Scanner(System.in);
        System.out.print("Saisir un nombre dont vous souhaitez la factorielle ");
        short factorielle=input.nextShort();
        int result=1;

        if(factorielle==0){
            System.out.println(result);
        } else if(factorielle<0) {
            System.out.println("Pas possible");
        } else {
            for (int i = 1; i <= factorielle; i++) {
                result=i*result;
            }
            System.out.printf("Factorielle de %d est %d", factorielle, result);
        }

    }
}
