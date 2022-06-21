package tp_validation_acquis.exo12;

public class Main {
    public static void main(String[] args) {


        Souris souris1 = new Souris(50, "blanche", 2);
        Souris souris2 = new Souris(45, "grise");
        Souris souris2Clonee = new Souris(souris2);

        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris2Clonee);

        souris1.veillir(36);
        souris2.veillir(36);
        souris2Clonee.veillir(28);
        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris2Clonee);





    }

}
