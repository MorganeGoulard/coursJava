package tp_java_poo.exo_algo.exo12;

public class Souris {

    private int poids;
    private String couleur;
    private int age;
    private int esperanceDeVie;
    private boolean cloned;

    private static final int ESPERANCE_VIE_DEFAUT=36;

    public Souris(int poids, String couleur, int age, int esperanceDeVie) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceDeVie = esperanceDeVie;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 0;
        this.esperanceDeVie = ESPERANCE_VIE_DEFAUT;
        System.out.println("une nouvelle souris !");
    }

    public Souris(int poids,String couleur, int age){
        this.poids=poids;
        this.couleur=couleur;
        this.age=age;
        this.esperanceDeVie=ESPERANCE_VIE_DEFAUT;
        System.out.println("Une nouvelle souris !");
    }


    //constructeurs de copie
    public Souris(Souris souris){
        this.poids=souris.poids;
        this.couleur=souris.couleur;
        this.age=souris.age;
        this.esperanceDeVie=(souris.esperanceDeVie)*(int)(4/5);
        this.cloned=true;
        System.out.println("Clonage d'une souris");
    }

    public int getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }

    public int getEsperanceDeVie() {
        return esperanceDeVie;
    }

    public boolean isCloned() {
        return cloned;
    }

    public String toString() {
        if (this.cloned == true) {
            return (String.format("Une souris %s, clonée, de %d mois et pesant %d grammes",
                    this.couleur, this.age, this.poids));
        } else {
            return (String.format("Une souris %s de %d mois et pesant %d grammes", this.couleur, this.age, this.poids));
        }
    }

    public void veillir(int nombreMois){
        this.age = this.age + nombreMois;
        if(this.cloned==true && this.age>(this.esperanceDeVie/2)){
            couleur="verte";
        }
    }

    public void evolue(){
        this.age=this.esperanceDeVie;
    }

}