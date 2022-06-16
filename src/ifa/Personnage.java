package ifa;

public class Personnage {
    private String nom;
    private String prenom;

    public Personnage(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}

class SuperHeros extends Personnage{
    public SuperHeros(String nom, String prenom) {
        super(nom, prenom);
    }
}

interface IVoler{ // convention : I<Nom de l'interface> ou <Nom de l'interface>able
     void voler();
}

class SuperHerosVolants extends SuperHeros implements IVoler{
    public SuperHerosVolants(String nom, String prenom) {
        super(nom, prenom);
    }

   @Override
    public void voler(){
       System.out.println("je peux voler comme superman");
   }

}

class InsecteGeantVolant implements IVoler{
    public void voler(){
        System.out.println("je peux voler comme un insecte");
    }
}

// On peut hériter que d'une seule classe mais on peut implémenter plusieurs interfaces

