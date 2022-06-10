import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {

        var input= new Scanner(System.in);

        var mail="";
        System.out.println("Veuillez définir votre adresse email : ");
        System.out.print("email : ");
        mail=input.nextLine();

        var mdp="";
        System.out.println("Veuillez définir votre mot de passe : ");
        System.out.print("mdp : ");
        mdp= input.nextLine();

        var mailATester="";
        var mdpATester="";

        var i=5;


        while(true) {
            if(i==0){
                System.out.println("Vous avez saisi des mauvais identifiants 5 fois, compte bloqué");
            }
            System.out.print("Entrer votre mail : ");
            mailATester = input.nextLine();
            System.out.print("Entrer votre mdp : ");
            mdpATester = input.nextLine();
            if (mailATester.equals(mail) & mdpATester.equals(mdp)) {
                System.out.println("Bienvenue dans votre espace client !");
                break;
            }
                i--;
                System.out.printf("Identifiants incorrect, il vous reste %d essai(s)\n",i);
            }




        }

    }

