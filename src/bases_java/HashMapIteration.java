package bases_java;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {

        HashMap<String, String> identite=new HashMap<>();
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");
        identite.put("pays","France");

        for(Map.Entry<String,String> maVariable: identite.entrySet()){
            System.out.println(maVariable.getKey()+" ==> "+maVariable.getValue());
        }

        int[] nombres={1,2,3,4,5,6};

        // la boucle forEach
        for(int nombre:nombres){
            System.out.println(nombre);
        }
    }
}
