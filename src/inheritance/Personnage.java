package inheritance;

public abstract class Personnage {
    //abstract : Personnage devient une classe abstraite
    // classe abstraite = classe qui ne peut avoir d'instance

    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public abstract void rencontrer();
    // à partir du moment ou une classe possède une méthode abstraite, la classe doit être abstraite

    public final void chanter (){
        System.out.println("J'aime chanter");
    }

    //toString : il permet de décrire l'objet
    // Si on le met ici, on a @override : c'est parce que en Java, toutes les classes héritent de la classe ancêtre Object
    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", dureeDeVie=" + dureeDeVie +
                '}';
    }
}
