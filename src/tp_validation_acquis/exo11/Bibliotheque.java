package tp_validation_acquis.exo11;

import java.util.ArrayList;

public class Bibliotheque {

    private String nomBibliothèque;
    private ArrayList<Exemplaire> exemplairesList=new ArrayList<>();
    private Exemplaire exemplaire;
    private Oeuvre oeuvre;
    private Auteur prix;

    public Bibliotheque(String nomBibliothèque) {
        this.nomBibliothèque = nomBibliothèque;
        System.out.printf("La bibliothèque %s est ouverte!\n",nomBibliothèque);
    }

    public String getNomBibliothèque() {
        return nomBibliothèque;
    }

    public int getNbExemplaires(){
            return exemplairesList.size();
    }


    public void stocker(Exemplaire exemplaireAAjouter){
        exemplairesList.add(exemplaireAAjouter);
        System.out.println(exemplaireAAjouter+" stocké dans la bibliothèque");
    }

    public void stocker(Exemplaire exemplaireAAjouter, int nombre) {
        for (int i = 0; i < nombre; i++) {
            stocker(exemplaireAAjouter);
        }
    }

    public ArrayList <Exemplaire> ListerExemplaires(String langue){
        var listeDesExemplaires=new ArrayList<Exemplaire>();
        if (langue == ""){
            return exemplairesList;
        } else {
            for (Exemplaire exemplaireRecherche : this.exemplairesList){
                if(exemplaireRecherche.getOeuvre().getLangue() == langue){
                    listeDesExemplaires.add(exemplaireRecherche);
                    System.out.printf("Les exemplaires de la bilibothèque %s en %s : %s\n",nomBibliothèque,langue,exemplaireRecherche);
                }
            }
        } return listeDesExemplaires;

    }

    public void compterExemplaires(Oeuvre oeuvre) {
        var repetition = 0;
        for (int i = 0; i < exemplairesList.size(); i++) {
            if (exemplairesList.get(i).getOeuvre().getAuteur().equals(oeuvre.getAuteur())) {
                repetition = repetition + 1;
            }
        }
        System.out.printf("La bibliothèque %s contient %d exemplaires de l'oeuvre %s",nomBibliothèque,repetition,oeuvre);
    }


    public void AfficherAuteur(boolean prix){
        var listeAuteur=new ArrayList<>();
        for (int i = 0; i < exemplairesList.size(); i++) {
            if(prix==true) {
                if(exemplairesList.get(i).getOeuvre().getAuteur().isPrix()==true){
                listeAuteur.add(exemplairesList.get(i).getOeuvre().getAuteur());
                }
            } else if(prix == false){
                if(exemplairesList.get(i).getOeuvre().getAuteur().isPrix()==false) {
                    listeAuteur.add(exemplairesList.get(i).getOeuvre().getAuteur());
                }
            }
        }
        for (int i = 0; i < listeAuteur.size(); i++) {
            System.out.println(listeAuteur.get(i));
        }
    }


    public void AfficherAuteur(){
        var listeAuteur = new ArrayList<>();
        for (int i = 0; i < exemplairesList.size(); i++) {
            if (exemplairesList.get(i).getOeuvre().getAuteur().isPrix() == true) {
                listeAuteur.add(exemplairesList.get(i).getOeuvre().getAuteur());
            }
        }
        for (int i = 0; i < listeAuteur.size(); i++) {
            System.out.println(listeAuteur.get(i));
        }
    }



}








