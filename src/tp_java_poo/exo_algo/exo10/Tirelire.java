package tp_java_poo.exo_algo.exo10;

public class Tirelire {

    private double solde;

    public Tirelire(double maTirelire) {
        this.solde = maTirelire;
    }

    public double getMontant(){
        return solde;
    }

    public String afficher(){
         if (this.solde > 0) {
            System.out.printf("vous avez %f € dans votre tirelire.",this.solde);
        } else if (this.solde < 0) {
            System.out.println("vous êtes à découvert :'(");
        }
        return "vous êtes sans le sou.";
    }

    public void secouer(){
        if (this.solde > 0){
            System.out.println("bling bling vous êtes riche\n");
        }
    }

    public double remplir(double montantaAjouter){
        if(montantaAjouter > 0){
            this.solde = this.solde+montantaAjouter;
        }
        return this.solde;
    }




}
