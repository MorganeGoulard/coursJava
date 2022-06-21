package tp_validation_acquis.exo10;

public class TestTirelire {
    public static void main(String[] args) {

        Tirelire maTirelire = new Tirelire(350);
        maTirelire.afficher();

        maTirelire.remplir(100);
        maTirelire.afficher();

        maTirelire.puiser(25);
        maTirelire.afficher();

        maTirelire.secouer();

        maTirelire.calculerSolde(500);
        maTirelire.calculerSolde(125);
        maTirelire.afficher();

        maTirelire.vider();
        System.out.println(maTirelire.afficher());;





    }
}
