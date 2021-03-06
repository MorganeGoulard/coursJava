package POO;

public class Main {
    // main = point d'entrée, c'est la 1ère méthode lancée quand on lance pg java
    // c'est à partir de là que le pg démarre.
    public static void main(String[] args) {

        /*BEFORE GETTER
        Rectangle2 rectangle= new Rectangle2(); // création d'un objet rectangle depuis la classe Rectangle
        System.out.println("Etat initial de l'objet après création");
        System.out.println("La longueur : "+rectangle.longueur);
        System.out.println("La longueur : "+rectangle.largeur);
        // longueur et largeur sont des attributs de l'objet(ou instance) créé rectangle à partir de la classe Rectangle
        // la seule situation où on a des valeurs sans donner des valeurs initiales ce sont les types écolués
        // --> tableau, String, objet concrets

        // maintenant on a la liberté de leur fournir des valeurs
        System.out.println("Etat de l'objet après avoir fourni des valeurs");
        rectangle.largeur=500;
        rectangle.longueur=350;
        System.out.println("Longueur : "+rectangle.longueur);
        System.out.println("Largeur : "+rectangle.largeur);

        System.out.println("Périmètre : "+rectangle.calculPerimetre());
        System.out.println("Surface : "+rectangle.calculSurface()); */

        // AFTER ADDING GETTERS AND SETTERS

        /*Rectangle2 rectangle= new Rectangle2(); // création d'un objet rectangle depuis la classe Rectangle
        System.out.println("Etat initial de l'objet après création");
        System.out.println("La longueur : "+rectangle.getLongueur());
        System.out.println("La largeur : "+rectangle.getLargeur());

        System.out.println();
        System.out.println("Etat de l'objet après avoir fourni des valeurs");
        rectangle.setLongueur(500);
        rectangle.setLargeur(350);
        System.out.println("Longueur : "+rectangle.getLongueur());
        System.out.println("Largeur : "+rectangle.getLargeur());

        System.out.println("Périmètre : "+rectangle.calculPerimetre());
        System.out.println("Surface : "+rectangle.calculSurface());*/

        // Ajout d'un constructeur
        Rectangle3 rectangle= new Rectangle3(500,350); // création d'un objet rectangle depuis la classe Rectangle
        System.out.println("Etat initial de l'objet après création");
        System.out.println("La longueur : "+rectangle.getLongueur());
        System.out.println("La largeur : "+rectangle.getLargeur());

        System.out.println();
        System.out.println("Etat de l'objet après avoir fourni des valeurs");
        /*rectangle.setLongueur(500);
        rectangle.setLargeur(350);
        System.out.println("Longueur : "+rectangle.getLongueur());
        System.out.println("Largeur : "+rectangle.getLargeur());

        System.out.println("Périmètre : "+rectangle.calculPerimetre());
        System.out.println("Surface : "+rectangle.calculSurface());*/

        Rectangle3 rect=new Rectangle3();
        System.out.println(rect.getLongueur());
        System.out.println(rect.getLargeur());

        System.out.println(rect);

    }
}
