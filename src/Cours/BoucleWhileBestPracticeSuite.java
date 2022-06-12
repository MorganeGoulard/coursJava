import java.util.Scanner;

public class BoucleWhileBestPracticeSuite {
    public static void main(String[] args) {

        var input=new Scanner(System.in);
        // DRY : Do not repeat Yourself
        var codePIN=""; // pour var, toujours donner une valeur initiale
        System.out.println("Veuillez définir votre code pin à 4 chiffres : ");
        while(true){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length()==4){
                System.out.println("Code PIN défini avec succès!");
                break;
            }
            System.out.println("Erreur! Code PIN doit être composé de 4 caractères");


            }



        System.out.println("*******************");
        System.out.println("Téléphone vérouillé");
        System.out.println("*******************");

        String codeATester="";

        while(true) { // ici on utilise equals car c'est un String
            System.out.print("Entrez votre code PIN pour déverouiller l'appareil: ");
            codeATester = input.nextLine();
            if (codeATester.equals(codePIN)) {
                System.out.println("Bienvenue!");
                break;
            }
            System.out.println("code PIN erroné, veuillez recommencer");
        }



    }
}
