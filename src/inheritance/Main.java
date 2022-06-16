package inheritance;

//surcharge : avoir plusieurs méthodes de même nom mais avec différentes signatures
// redéfinition ou overriding : fournir ou implémentation d'une méthode déjà exxistante
// dans une classe parent.

public class Main {
    public static void main(String[] args) {

       Guerrier chris = new Guerrier("Christian", 400, "M16");
        Guerrier mansour = new Guerrier("Mansour", 900, "lance-pierre");

        Voleur jean = new Voleur("Jean", 1000, "Mains");

        Magicien nouha = new Magicien("Nouha", 100, "baguette mystique");

        Sorcier morgane=new Sorcier("Morgane", 200, "baguette morganienne",
                "baton morganien");

        chris.rencontrer();
        mansour.rencontrer();
        jean.rencontrer();
        nouha.rencontrer();
        morgane.rencontrer();

        // on ne peut pas créer d'instance d'une classe abstraite
        // Personnage maeva = new Personnage("Maeva",150);

        /*System.out.println(chris);
        System.out.println(mansour);
        System.out.println(jean);
        System.out.println(nouha);
        System.out.println(morgane);*/

    }

}
