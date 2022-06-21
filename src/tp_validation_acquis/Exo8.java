package tp_validation_acquis;

import java.util.Arrays;

public class Exo8 {
    public static int [] voirPosition (String [] tabDirection) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < tabDirection.length; i++) {
            if (tabDirection[i].equals("haut")) {
                y=y+1;
            }
            if (tabDirection[i].equals("bas")) {
                y=y-1;
            }
            if (tabDirection[i].equals("gauche")) {
                x=x-1;
            }
            if (tabDirection[i].equals("droite")) {
                x=x+1;
            }
        }
        int[] position = {x, y};
        return position;


    }

    public static void main(String[] args) {

        String [] maPosition = {
                "haut",
                "haut",
                "bas",
                "gauche",
                "gauche",
                "droite",
                "haut"
        };

        System.out.println(Arrays.toString(maPosition));
        System.out.println("La position est : "+ Arrays.toString(voirPosition(maPosition)));

    }
}
