package exercice_poo_vehicules;

public abstract class Vehicule {

    private int matricule;
    private String year;
    private double price;

    public static int nextMatricule = 0;

    public Vehicule(String year, double price) {
        this.matricule=nextMatricule;
        nextMatricule++;
        this.year = year;
        this.price = price;

    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}
