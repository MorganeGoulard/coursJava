package tp_validation_acquis.exo11;

public class Auteur {

    private String nom;
    private boolean prix;

    public Auteur(String nom, boolean prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public boolean isPrix(){
        return prix;
    }

    public String toString(){
        return String.format("Auteur : "+this.nom);
    }

}
