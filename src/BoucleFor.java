import java.util.Scanner;

public class BoucleFor {
    public static void main(String[] args) {
        // Afficher tous les nombres de 1 à 10 à la puissance 2
        // Avant la boucle for
        System.out.println(Math.pow(1,2));
        System.out.println(Math.pow(2,2));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.pow(6,2));
        System.out.println(Math.pow(7,2));
        System.out.println(Math.pow(8,2));
        System.out.println(Math.pow(9,2));
        System.out.println(Math.pow(10,2));

        // pour i <- allant de 1 à 10
        // Math.pow(1,2) => Math.pow(1,2)
        // i = i + 1
        // Fin pour
        System.out.println("utilisation boucle for");
        for(int i=1;i<=10;i=i+1){
            System.out.println(Math.pow(i,2));
        }

        System.out.println("Table multiplication\n================");
        var input=new Scanner(System.in);
        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");
        var nombre= input.nextInt();
        for(int i=1;i<=12;i++) {
//            System.out.println(nombre + " x " + i + " = " + i * nombre);
            System.out.printf("%d x %d = %d\n",nombre,i,(nombre*i));
        }

        //        Table de multplication version 2
        System.out.println("Table multiplication V2\n========================");
        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");
        var nombre2=input.nextInt();
        System.out.print("Debut : ");
        var nombreDebut=input.nextInt();

        System.out.print("Fin : ");
        var nombreFin=input.nextInt();


        for(int i=nombreDebut;i<=nombreFin;i +=1){
//            System.out.println(nombre2+ " x "+i+" = "+(i*nombre2));
            System.out.printf("%d x %d = %d\n",nombre2,i,(nombre2*i));
        }



    }
}
