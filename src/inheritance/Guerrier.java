package inheritance;

public class Guerrier extends Personnage{ // en java, héritage multiple n'existe pas.
    // si tu hérites d'une classe abstraite et que cette classe a une méthode abstraite
    // soit la classe enfant est une classe abstraite, ou si elle est concrête elle doit
    //implémenter la méthode rencontrer ==> c'est le CONTRAT

    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom, dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    //redéfinition de la méthode rencontrer()


    @Override // @Override veut dire : la méthode en dessous existe déjà qlq part dans la hierarchie de classe
    public void rencontrer() {
        System.out.println("Je suis un guerrier et je vais te tuer");;
    }
    // la méthode rencontrer() est devenue une méthode spécialisée


    @Override
    public void chanter() {
        System.out.println("je peux chanter comme une guerrier");
    }
}
