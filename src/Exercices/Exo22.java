package Exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] mail={
                "christian.lisangola@gmail.com", "jean.paul@gmail.com",
                "alain@gmail.com", "lydie@yahoo.fr", "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr", "philemon.turion@gmail.com", "jules.cesar@hotmail.fr"};


        float sumGmail=0f;
        float sumYahoo=0f;
        float sumHotmail=0f;
        for (int i = 0; i < mail.length; i++) {
            var cut1= mail[i].split("@");
            var cut2 = cut1[1].split("\\.");
            var domain=cut2[0];
            if (domain.equals("gmail")) {
                sumGmail=sumGmail+1;
            } else if (domain.equals("yahoo")) {
                sumYahoo=sumYahoo+1;
            } else if (domain.equals("hotmail")){
                sumHotmail=sumHotmail+1;
            }
        }
        float pourcentG= (sumGmail/mail.length)*100;
        float pourcentY= (sumYahoo/mail.length)*100;
        float pourcentH= (sumHotmail/mail.length)*100;

        System.out.printf("%% de gmail = %.0f %%, %% de yahoo = %.0f %%, %% de hotmail = %.0f %%",pourcentG,pourcentY,pourcentH);


    }
}
