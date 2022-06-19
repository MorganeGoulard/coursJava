package tp_validation_acquis.exo11;

public class Exemplaire {

    private Oeuvre oeuvre;
    private boolean copie;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.printf("Nouvel exemplaire -> %s\n",oeuvre);
    }

    public Exemplaire(Oeuvre oeuvre, boolean copie){
        this.oeuvre=oeuvre;
        this.copie=copie;
        if (copie==false){
            System.out.printf("Nouvel exemplaire -> %s\n",oeuvre);
        } else if (copie==true){
            System.out.printf("Copie d'un exemplaire de -> %s\n", oeuvre);
        }
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    @Override
    public String toString(){
        return String.format("Exemplaire de : "+this.oeuvre);
    }
}
