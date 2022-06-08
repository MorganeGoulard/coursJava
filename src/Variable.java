public class Variable {
    public static void main(String[] args) {
        // variable/fonction : camelCase
        // classe : PascalCase

        // ici pour l'âge, type adapté c'est byte
        byte age=18;//la variable ne peut stocker que des entiers.


        // calcul Rectangle
        int longueur=50;
        int largeur=25;
        int surface =longueur*largeur;
        int perimetre=2*(longueur+largeur);
        System.out.println(surface);
        System.out.println(perimetre);

        // calcul de la vitesse moyenne en MRU
        float distanceParcourue=90.6F;
        float temps=12.345F;
        double vitesseMoyenne=distanceParcourue/temps;
        // tous les floats sont des doubles donc ici par d'erreur sur résultat vitesse
        // mais si on avait eu l'inverse, erreur car tous les double ne sont pas des floats

        // calcul somme des nombres
        float prix=150.5F;

        // chaîne de caractères et caracters
        // pour ce qui est texte, tjr double guillemets
        String prenom="Morgane";//chaîne de caractères
        char gendre='M';

    }
}
