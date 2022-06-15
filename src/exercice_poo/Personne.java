package exercice_poo;

public class Personne {

    String firstName;
    String lastName;
    String pays;
    boolean married;
    byte nombreEnfants;

    String nomComplet(){
        return firstName+" "+lastName;
    }
}
