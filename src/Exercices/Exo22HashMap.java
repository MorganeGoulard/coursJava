package Exercices;

import java.util.HashMap;
import java.util.Map;

public class Exo22HashMap {
    public static void main(String[] args) {

        String[] mail = {
                "christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"
        };

        HashMap<Integer, String> hashMap = new HashMap<>();
        String domaine ="";
        for (int i = 0; i < mail.length; i++) {
            mail=mail[i];
            int star =
        }


        float sumG = 0f;
        float sumY = 0f;
        float sumH = 0f;
        if (mail.values() == "gmail") {
            sumG = sumG + 1;
        } else if (mail.values() == "yahoo") {
            sumY = sumY + 1;
        } else if (mail.values() == "hotmail") {
            sumH = sumH + 1;
        }


        float pourcentG = (sumG / mail.length()) * 100;
        float pourcentY = (sumY / mail.length()) * 100;
        float pourcentH = (sumH / mail.length()) * 100;

        System.out.printf("%% de gmail : %.0f %%, %% de yahoo : %d.0f %%, %% de hotmail %.0f %% ", pourcentG, pourcentY, pourcentH);


    }
}
