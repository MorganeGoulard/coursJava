import java.util.Scanner;

public class E12 {
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

        while(true) {
            System.out.print("Entrer votre mail : ");
            mailATester = input.nextLine();
            System.out.print("Entrer votre mdp : ");
            mdpATester = input.nextLine();
            if (mailATester.equals(mail) && mdpATester.equals(mdp)) {
                System.out.printf("Bienvenue dans votre espace client %s!",mail);
                break;
            }
            System.out.println("Identifiants incorrect");
        }







    }
}
