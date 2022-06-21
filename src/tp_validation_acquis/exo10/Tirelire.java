package tp_validation_acquis.exo10;

import org.w3c.dom.ls.LSOutput;

public class Tirelire {

    private double solde;

    public Tirelire(double tirelire) {
        this.solde = tirelire;
    }

    public double getMontant(){
        return solde;
    }

    public String afficher(){
         if (this.solde > 0) {
            System.out.printf("vous avez %.2f € dans votre tirelire.\n",this.solde);
        } else if (this.solde < 0) {
            System.out.println("vous êtes à découvert :'(");
        }
        return "Vous êtes sans le sou.";
    }

    public void secouer(){
        if (this.solde > 0){
            System.out.println("bling bling vous êtes riche\n");
        } else {
            System.out.println("*pas de bruit*");
        }
    }

    public double remplir(double montantaAjouter){
        if(montantaAjouter > 0){
            this.solde = this.solde+montantaAjouter;
        }
        return this.solde;
    }

    public double vider(){
        return this.solde = 0;
    }

    public void puiser(double montantAPuiser){
        if(montantAPuiser > this.solde){
            System.out.println("vous n'avez pas assez d'argent pour cette opération");
        } else {
            this.solde=this.solde - montantAPuiser;
        }
    }

    public double calculerSolde(double budget){
        if(budget<this.solde){
            this.solde=this.solde - budget;
            System.out.printf("vous êtes assez riche pour partir en vacances, il vous restera %.2f à votre retour\n", this.solde);
        } else if(budget>this.solde) {
            System.out.printf("vous n'avez pas assez d'argent pour partir en vacances, il vous manque %.2f\n",(budget-this.solde));
        }
        return this.solde;
    }







}
