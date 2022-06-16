package static_methode;

public class AppConfig {
    public static final String DATABASE_URL="mysql://localhost:3306";
    public static final String DATABASE_USER="root";
    public static final String DATABASE_PASSWORD="";

    public static final int MIN_PASSEWORD=8;
    public static final int MAX_PASSEWORD=15;

    // une variable statuc qui est publique => pas besoin de créer une instance pour y accéder.
    // c'est grâce à ça qu'on peut avoir accès à Math.PI
    // si on veut un fichier avec des config qui ne vont pas changer au cours du pg, on créer une variable static
    // ces variables static ne sont pas des variables d'instance car ça sera une information partagée
    // comme le nombre PI
    // si on sait que ces valeurs ne vont pas changer, on ne fait des constantes avec final
    // Convention : les constantes en MAJUSCULES. Si 2 mots, la seule fois ou on peut metter _

}
