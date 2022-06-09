public class ConstanteEtVar {
    public static void main(String[] args) {
        // une fois déclarée, la valeur ne peut plus changer
        final double g=9.8;

        // déclaration par inférence
        // au moment déclaration variable, pas obligé de spécifier son type
        // on va laisser java deviner le type approprié selon valeur initiale fournie
        var pays="France";

        var age1=26;

        int age; // déclaration sans initialisation
        age=17;

        double poids=85; // déclaration

    }
}
