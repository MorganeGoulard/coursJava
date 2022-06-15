package approche_procedurale;

public class PrograProcedurale {

    // Requirement pour périmètre d'un rectangle :
    // --> connaitre longueur et largeur
    // --> connaitre type de données pour les 2 dimensions
    // --> connaitre le type de données qui sera produit à l'issue du traitement

    // création machine
    static float calculPerimetre(float longueur,float largeur) {
        return (longueur+largeur)*2;
    }

    static float calculSurface(float longueur,float largeur) {
        return (longueur*largeur);
    }

    public static void main(String[] args) {
        //Ractangle 1
        float longueur=500.5F;
        float largeur=250F;

        float perimetre=calculPerimetre(longueur,largeur);
        float surface=calculSurface(longueur,largeur);

        System.out.printf("Surface 1 : %f\n Perimètre 1 : %f ",surface,perimetre);

        //Rectangle 2
        float longueur2=33f;
        float largeur2=45f;
        float surface2=longueur2*largeur2;
        float perimetre2=2*(longueur2+largeur2);

        // Ici, seules les données changent mais traitement exactement le même donc duplication
        // On va donc créer des "machines" pour éxécuter ces traitement avec différentes données mais
        // sans dupliquer le code => fonction
        // en Java, comme langage exclusivement orienté objet, ces fonctions=méthodes.



    }
}
