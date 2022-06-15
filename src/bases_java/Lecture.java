import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom =input.nextLine(); // nextLine : on s'intéresse à toute la ligne

        System.out.print("Votre prénom : ");
        String prenom=input.nextLine();


        System.out.print("Votre genre : ");
        char genre=input.next().charAt(0);

        System.out.print("votre age : ");
        byte age=input.nextByte();

        System.out.print("votre poids : ");
        float poids=input.nextFloat();

        System.out.printf("Nom : %s\nPrenom : %s\nGenre : %c\nAge : %d\nPoids : %.2f",nom,prenom,genre,age,poids);


        // next : ne prend que la première partie (avant un espace par ex)
        // charAt(0) : ne prend que la 1ère valeur
        // lors d'un String, java il crée un petit tableau avec tous les caractères ensemble
        // jean => (char)j=>0, (char)e=>1 (char)a=>2 (char)n=>3


 //       String nom="Zozor";
  //      String prenom="Jean";
 //       char genre='M';
  //      byte age=12;
  //      float poids=35.5F;

    }
}
