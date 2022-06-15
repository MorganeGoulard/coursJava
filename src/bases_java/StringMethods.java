package bases_java;

public class StringMethods {
    public static void main(String[] args) {

        // variable.charAt() : retourne le caractère à la position passée en argument
        String nom="Maeva";
        System.out.println(nom.charAt(2));//Accéder à un caractère du tableau

        //Parcourir un string caractère par caractère
        System.out.println("itération sur les caractères\n====================");
        for (int i = 0; i < nom.length(); i++) {//quand il s'agit des string, après length il faut () car c'est une méthode
            System.out.println(nom.charAt(i));
        }

        //variable.indexOf() : retourne la première occurence de l'index du caractère
        // passé en argument
        System.out.println(nom.indexOf('a'));

        //remplacement des caractères
        String nom2="abracadabra";
        System.out.println();
        System.out.println(nom2.replace('a','*'));

        // Extraire une sous chaîne : Christian Lisangola
        System.out.println();
        String chaine="Christian Lisangola";
        String chaine2=chaine.substring(0,9);//intervalle [0;9[
        System.out.println(chaine2);

    }
}
