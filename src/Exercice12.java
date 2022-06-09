import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {

        var input=new Scanner(System.in);
        System.out.print("Saisir nombre de départ ");
        int startNumber= input.nextInt();
        int endNumber = startNumber + 10;

        for(int i=startNumber;i<endNumber;i++){
            System.out.println(i+1);
        }

    }
}
