package bases_java;

public class TableauAPlusieursDimensions {
    public static void main(String[] args) {

        /*int[] a={1,2,3,4,5};
        int [] a2=new int[5];*/

        int[][] nombre={
                {1,2,6,5},
                {2,4,9},
                {7,3}
        };

        //Affichage sans boucle
        System.out.println("Affichage sans boucle\n------------");
        // Premiere ligne(tableau)
        System.out.println("1er tableau\n=========");
        System.out.println(nombre[0][0]);
        System.out.println(nombre[0][1]);
        System.out.println(nombre[0][2]);
        System.out.println(nombre[0][3]);

        //2ème ligne(tableau)
        System.out.println("2eme tableau\n=========");
        System.out.println(nombre[1][0]);
        System.out.println(nombre[1][1]);
        System.out.println(nombre[1][2]);

        //3è ligne(tableau)
        System.out.println("3eme tableau\n=========");
        System.out.println(nombre[2][0]);
        System.out.println(nombre[2][1]);

        System.out.println("Affichage avec boucle for \n-----------");
        for (int i = 0; i < nombre.length; i++) {
            //System.out.println(Arrays.toString(nombre[i]));
            for (int j = 0; j < nombre[i].length; j++) {
                System.out.println(nombre[i][j]);
            }
        }

    }
}
