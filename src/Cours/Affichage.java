public class Affichage {
    public static void main(String[] args) {
        String nom="Jean Zozor";
        char genre='M';
        byte age=12;
        float poids=35.5F;
        boolean isMarried=true;
        System.out.println("Vous vous appelez "+nom+", et vous avez "+age+" ans. Poids = "+poids+" kg");
        // on peut vite s'y perdre et se tromper avec les +
        System.out.printf("Vous vous appelez %s, vous avez %d ans, vous pesez %.1f kg\n",nom,age,poids);
        // %s : string, %d : int, short, byte, %f : nb à virgule, %c : char
        // %f : pas de précision sur nb de décimales, %.1f : 1 décimale
        // \n : pour aller à la ligne
        System.out.printf("Papi et Mamie\n");
        System.out.printf("Nom : %s\nAge : %d\nPoids : %.1f\n",nom,age,poids);
        // avec opérateur ternaire isMarried?"condition vraie":"condition fausse"
        System.out.printf("Vous vous appelez %s, vous avez %d ans et vous %s\n",nom,age,
                isMarried?"etes marié":"n'êtes pas marié");
        // sans opérateur ternaire
        String etatMaritalAffiche=isMarried?"etes marié":"n'êtes pas marié";
        System.out.printf("Vous vous appelez %s, vous avez %d ans et vous %s\n",nom,age,etatMaritalAffiche);

    }
}
