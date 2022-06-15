import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {

        // Saisir la valeur de a
        // Saisir la valeur de b
        // Saisir la valeur de c
        // Affichage réponse équation

        Scanner input=new Scanner(System.in);
        System.out.print("Saisir la valeur de a : ");
        int a=input.nextInt();
        System.out.print("Saisir la valeur de b : ");
        int b=input.nextInt();
        System.out.print("Saisir la valeur de c : ");
        int c=input.nextInt();

        double delta=(Math.pow(b,2)-4*a*c);
        System.out.println("La valeur de delta est "+delta);
        if(delta>0){
            System.out.print("L'équation a 2 solutions possibles : x1="+((-b-(Math.sqrt(delta)))/(2*a))+
                    " ou x2="+((-b+(Math.sqrt(delta)))/(2*a)));
        }else if(delta==0){
            System.out.print("L'équation a une solution unique : x="+(-b/2*a));
        }else{
            System.out.print("L'équation n'a pas de solution");
        }

    }
}
