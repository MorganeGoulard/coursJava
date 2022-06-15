package POO;

class Rectangle {
    double longueur; // attributs
    double largeur; // attributs
    // cette fois ci, pour calculer la surface et périmètre, pas besoin de lui passer longueur et largeur
    // car on a la classe Rectangle et longueur et largeur sont déjà compris dans la classe Rectangle

    // création de la méthode surface: pas besoin ici de préciser calculSurfaceRectangle
    double calculSurface(){
        return longueur*largeur;
    }

    double calculPerimetre(){
        return 2*(longueur+largeur);
    }
}
