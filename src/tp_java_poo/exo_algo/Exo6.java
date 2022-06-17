package tp_java_poo.exo_algo;
import java.util.Scanner;
import java.util.ArrayList;

public class Exo6 {


    public static ArrayList<String> maMethode(int [][] matrice, int nombre) {
        int occurence = 0;
        ArrayList<String> position = new ArrayList<>();

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (matrice[i][j] == nombre) {
                    occurence = occurence + 1;
                    position.add("["+i+"]["+j+"]");
                }
            }
        }
        return position;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matrice = {
                {1,4,2,1},
                {6,3,8,9},
                {1,5,1,0}
        };

        System.out.println("Quel nombre souhaitez vous rechercher ? ");
        var nombre=input.nextInt();

        Exo6.maMethode(matrice,nombre);
        int occurence=Exo6.maMethode(matrice, nombre).size();

        System.out.printf("le nombre %d se retrouve %d fois dans les emplacement : \n",nombre, occurence);
        System.out.println(Exo6.maMethode(matrice,nombre));





    }

}
