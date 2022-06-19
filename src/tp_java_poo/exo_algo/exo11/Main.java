package tp_java_poo.exo_algo.exo11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Bibliotheque bibliotheque1 = new Bibliotheque("municipale");
        Auteur auteur1=new Auteur("Dan Brown", false);
        Auteur auteur2=new Auteur("Barjavel",true);
        Auteur auteur3=new Auteur("Stalinger",true);
        Auteur auteur4=new Auteur("Stendhal", false);

        Oeuvre oeuvre1=new Oeuvre("Le rouge et le noir",auteur4);
        Oeuvre oeuvre2=new Oeuvre("La nuit des temps", auteur2);
        Oeuvre oeuvre3=new Oeuvre("l'attrape coeur",auteur3);
        Oeuvre oeuvre4=new Oeuvre("Le symbole perdu", auteur1,"anglais");

        Exemplaire exemplaire1=new Exemplaire(oeuvre1,false);
        Exemplaire exemplaire2=new Exemplaire(oeuvre2,false);
        Exemplaire exemplaire3=new Exemplaire(oeuvre2,true);
        Exemplaire exemplaire4=new Exemplaire(oeuvre4);
        Exemplaire exemplaire5=new Exemplaire(oeuvre4,false);

        bibliotheque1.stocker(exemplaire1);
        bibliotheque1.stocker(exemplaire4,2);
        bibliotheque1.stocker(exemplaire2);
        System.out.println();
        System.out.println("Listing après stockage : ");
        bibliotheque1.ListerExemplaires("");
        bibliotheque1.compterExemplaires(oeuvre4);


        System.out.println("\nAFFICHAGE AUTEUR");
        System.out.println("auteurs sans prix : ");
        bibliotheque1.AfficherAuteur(false);
        System.out.println("auteurs avec prix : ");
        bibliotheque1.AfficherAuteur(true);
        bibliotheque1.AfficherAuteur();



    }

}
