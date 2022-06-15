package POO;

public class Rectangle3 {

    private double longueur;
    private double largeur;

    public Rectangle3(double longueur,double largeur) { // Le constructeur est public et même nom que classe
        this.longueur=longueur;
        this.largeur=largeur;
    }
    // le constructeur est une méthode très spéciale
    // (il ne va rien retourner, mais pas de void pour dire qu'on retourne rien)
    // il permet d'initialiser un objet
    public double getLongueur(){ // convention pour lire longueur
        return longueur;
    }
    public double getLargeur(){
        return largeur;
    }

    public void setLongueur(double longueur){
        this.longueur=longueur;
    }

    public void setLargeur(double largeur){
        this.largeur=largeur;
    }

    double calculSurface(){
        return longueur*largeur;
    }

    double calculPerimetre(){
        return 2*(longueur+largeur);
    }


}


