package tp_validation_acquis.exo11;

public class Oeuvre {

    private String titre;
    private String langue;

    Auteur auteur;

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }

    // constructeur par défaut pour langue = français

    public Oeuvre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur=auteur;
        this.langue="français";
    }

    public String getTitre() {
        return titre;
    }

    public String getLangue() {
        return langue;
    }

    public Auteur getAuteur(){
        return auteur;
    }

    public String toString(){
        return String.format(
                "[Titre : "+this.titre+"/"+this.auteur+" édité en "+this.langue+"]"
                );
    }

}

