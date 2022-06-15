package exercice_poo_imc;

public class Patient {

    private String firstName;
    private String lastName;
    private double taille;
    private double poids;

    //contructeur par défaut
    public Patient (){
        this.firstName="";
        this.lastName="";
        this.taille=0;
        this.poids=0;
    }

    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    //setters


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setTaille(double taille) {
        if(taille > 0) {
            this.taille = taille;
        }
        System.exit(1);
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    double calculIMC(){
        return poids/(taille*taille);
    }
}
