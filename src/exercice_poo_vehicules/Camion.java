package exercice_poo_vehicules;

public class Camion extends Vehicule{

    public Camion(String year, double price) {
        super(year, price);
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage du camion");
    }

    @Override
    public void accelerer() {
        System.out.println("Appuyez sur la pédale pour accélérer votre camion");
    }
}
