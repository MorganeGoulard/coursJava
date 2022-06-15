import java.util.Scanner;

public class BoucleWhile2 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        var codePIN="";
        System.out.println("Veuillez définir votre code pin à 4 chiffres : ");
        while(codePIN.length()!=4){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length()!=4){
                System.out.println("Erreur! Code PIN doit être composé de 4 caractères");
            }else{
                System.out.println("Code PIN défini avec succès!");
            }
        }


        System.out.println("*******************");
        System.out.println("Téléphone vérouillé");
        System.out.println("*******************");

        String codeATester="";

        while(!codeATester.equals(codePIN)){ // ici on utilise equals car c'est un String
            System.out.print("Entrez votre code PIN pour déverouiller l'appareil: ");
            codeATester=input.nextLine();
            if(codeATester.equals(codePIN)){
                System.out.println("Bienvenue!");
            }else{
                System.out.println("code PIN erroné, veuillez recommencer");
            }
        }

    }
}
