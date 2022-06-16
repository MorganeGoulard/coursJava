package static_methode;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(625));

        System.out.println("url de la base de données : "+Configuration.DATABASE_URL);

        // simuler un formulaire
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.print("Email : ");
            var email=input.nextLine();

            System.out.print("mdp : ");
            var mdp=input.nextLine();

            if(!Validator.isEmail(email)){
                System.out.println("email saisi n'est pas valide");
                continue;
            }

            if(!Validator.minMax(mdp,AppConfig.MIN_PASSEWORD,AppConfig.MAX_PASSEWORD){
                System.out.println("le mdp doit etre compris entre8 et 15 caractères");
            }

            if(Validator.isEmail(email) && Validator.minMax(mdp,AppConfig.MIN_PASSEWORD,AppConfig.MAX_PASSEWORD)){
                System.out.println("Bienvenue");
                break;
            }
        }


    }
}
