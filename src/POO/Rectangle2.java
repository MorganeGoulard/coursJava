package POO;

// Quand on ne fournit pas un constructeur,
// le compilateur java invoque un constructeur spécial appelé
// "Le constructeur par défaut par défaut"
public class Rectangle2 {
    private double longueur;
    private double largeur;

    // Accesseurs = Getter : méthodes qui donnent un accès en lecture aux membres(attributs)
    // qui sont privés
    public double getLongueur(){ // convention pour lire longueur
        return longueur;
    }
    public double getLargeur(){
        return largeur;
    }

    // Manipulateurs = Setter : méthodes qui donnent la possibilité de modifier des attributs privés
    // Aucune intention de lecture, donc on veut modifier et c'est tout

    // public : c'est pour y avoir accès
    // void : ça veut dire qu'on ne retourne rien, car pas d'intention d'affichage mais seulement de modifier
    public void setLongueur(double longueur){
        this.longueur=longueur;
    }
    // this permet d'éviter le shadowing(masquage)
    // shadowing est le fait qu'un paramètre de fonction empêche la fonction/méthode de voir
    // l'attribut avant le même nom

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

