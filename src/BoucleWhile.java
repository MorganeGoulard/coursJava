import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Veuillez entrer votre code pin : ");
        var codePIN=input.nextInt();

        System.out.print("Téléphone vérouillé");

        int codeATester=0;

        while(codeATester!=codePIN){
            System.out.print("Entrez votre code PIN : ");
            codeATester=input.nextInt();
        }

    }
}
