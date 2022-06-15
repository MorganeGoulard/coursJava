package bases_java;

import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {

        /*HashMap<String, String> identite=new HashMap<>();
        identite.put("nom", "Lisangola");
        identite.put("prenom","Christian");
        System.out.println(identite.get("nom"));*/

        String phrase="Je suis dans une joie immense";

        HashMap<Character, Integer> occurenceLettre=new HashMap<>();

        System.out.println(occurenceLettre);


        for (int i = 0; i < phrase.length(); i++) {
          //  System.out.println(phrase.charAt(i));
            char key=phrase.charAt(i);
            if (occurenceLettre.containsKey(key)){
                int previousValue=occurenceLettre.get(key);
                occurenceLettre.replace(key,previousValue+1);
            }else{
                occurenceLettre.put(key,1);
            }
        }

        System.out.println(occurenceLettre);
        System.out.println("occurence de s : "+occurenceLettre.get('s'));


    }
}
