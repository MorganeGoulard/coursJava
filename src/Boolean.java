public class Boolean {
    public static void main(String[] args) {

        // type booléen : utiliser si valeurs vraies ou fausses
        // quand on fait un if, c'est toujours évalué à un booléen
        // si on laisse estMajeur=true, ce n'est pas dynamique, il faut l'associer à age
        byte age=12;
        boolean estMajeur=age>=18;//true ou false
        if(estMajeur){
            System.out.println("Vous êtes majeur");
        }else{
            System.out.println("Vous êtes mineur");
        }
    }
}
