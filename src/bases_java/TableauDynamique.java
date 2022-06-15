package bases_java;

import java.util.ArrayList;

public class TableauDynamique {
    public static void main(String[] args) {

        ArrayList<Integer> notes=new ArrayList<>();

        ArrayList<String> langageDeProgrammation=new ArrayList<>();
        // ArrayList : tableau dynamique, <Type de données>
        //type de données : en PascalCase, donc pas de type primitif mais que type évolué
        //donc un objet!!!
        System.out.println("Taille du tableau : "+langageDeProgrammation.size());

        langageDeProgrammation.add("java"); //0
        langageDeProgrammation.add("Python");//1
        langageDeProgrammation.add("C++");//2
        langageDeProgrammation.add("Fortran");//3
        langageDeProgrammation.add("Visual Basic 6.0");//4

        System.out.println("Taille du tableau : "+langageDeProgrammation.size());
        System.out.printf("langageDeProgrammation[%d] = %s\n",0,langageDeProgrammation.get(0));
        System.out.printf("langageDeProgrammation[%d] = %s",1,langageDeProgrammation.get(1));

        // [1,2,3] => tableau.add(45)
        // [1,2,3,45]

        System.out.println("Tableau avant suppression");
        System.out.println(langageDeProgrammation);

        langageDeProgrammation.remove(4);
        System.out.println("Tableau après suppression");
        System.out.println(langageDeProgrammation);
        // méthode remove qui peut être couteuse en performance car si on retire un élément
        // qui n'est pas à la fin, tous les autres vont avoir un index qui va être recalculé

        System.out.println();
        System.out.println("Renomer Python en Python 3.7");
        langageDeProgrammation.set(1,"Python 3.7");
        System.out.println("Tableau après renommage de Python en Python 3.7");
        System.out.println(langageDeProgrammation);

        //Tester si le tableau est vide
        if(langageDeProgrammation.isEmpty()){
        //if(langageDeProgrammation.size()==0){
            System.out.println("Le tableau est vide");
        }else {
            System.out.println("Le tableau n'est pas vide");
        }

        // PArcourir un tableau dynamique

        for (int i = 0; i < langageDeProgrammation.size(); i++) {
            System.out.printf("élément[%d] : %s\n",i,langageDeProgrammation.get(i));
        }

        // Vider le tableau
        langageDeProgrammation.clear();
        if(langageDeProgrammation.size()==0){
            System.out.println("Le tableau est vide");
        }else {
            System.out.println("Le tableau n'est pas vide");
        }





    }
}

