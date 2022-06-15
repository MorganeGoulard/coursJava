package exercice_poo_personne;

public class Personne {

    private String firstName;
    private String lastName;
    private String pays;
    private boolean married;
    private byte nombreEnfants;

    // Constructor
    public Personne(String firstName, String lastName, String pays, boolean married, byte nombreEnfants){
        this.firstName=firstName;
        this.lastName=lastName;
        this.pays=pays;
        this.married=married;
        this.nombreEnfants=nombreEnfants;
    }
// getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPays(){
        return pays;
    }

    public boolean getMarried() {
        return married;
    }
    public byte getNombreEnfants(){
        return nombreEnfants;
    }

// setters
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setPays(String pays){
        this.pays=pays;
    }
    public void setMarried(boolean married){
        this.married=married;
    }
    public void setNombreEnfants(byte nombreEnfants){
        this.nombreEnfants=nombreEnfants;
    }

    String nomComplet(){
        return firstName+" "+lastName;
    }
}
