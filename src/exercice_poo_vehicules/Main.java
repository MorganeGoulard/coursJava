package exercice_poo_vehicules;

public class Main {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("2006", 4799);
        Voiture voiture2 = new Voiture("2020", 9800);

        Camion camion1 = new Camion("1997", 12500);

        System.out.println(camion1.getMatricule());
        voiture1.demarrer();
        camion1.demarrer();
        voiture2.accelerer();
        camion1.accelerer();

        System.out.println(voiture1);


    }
}
