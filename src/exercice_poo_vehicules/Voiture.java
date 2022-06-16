package exercice_poo_vehicules;

public class Voiture extends Vehicule{

    public Voiture(String year, double price) {
        super(year, price);
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage de la voiture");
    }

    @Override
    public void accelerer() {
        System.out.println("Appuyez sur la pédale pour accélérer votre voiture");
    }
}
