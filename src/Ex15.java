import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        var input=new Scanner(System.in);
        System.out.println("Combien de valeur voulez vous pour le tableau 1 ? ");
        var valeurT1= input.nextInt();
        System.out.println("Combien de valeur voulez vous pour le tableau 2 ? ");
        var valeurT2= input.nextInt();
        System.out.println("Combien de valeur voulez vous pour le tableau 3 ? ");
        var valeurT3= input.nextInt();

        int [] tableau1= new int[valeurT1];
        int [] tableau2= new int[valeurT2];
        int [] tableau3= new int[valeurT3];


        for (int i = 0; i <= tableau1.length -1 ; i++) {
            System.out.printf("Valeur [%d] de tableau 1 : ",i);
            tableau1[i]=input.nextInt();
        }

        for (int j = 0; j <= tableau2.length -1 ; j++) {
            System.out.printf("Valeur [%d] de tableau 2 : ",j);
            tableau2[j]=input.nextInt();
        }

        for (int k = 0; k <= tableau3.length -1 ; k++) {
            System.out.printf("Valeur [%d] de tableau 3 : ",k);
            tableau3[k]=input.nextInt();
        }

        System.out.println(Arrays.toString(tableau1));
        System.out.println(Arrays.toString(tableau2));
        System.out.println(Arrays.toString(tableau3));

    }
}
