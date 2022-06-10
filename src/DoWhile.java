public class DoWhile {
    public static void main(String[] args) {

        int age=23;
        // on entre jamais dans la boucle car il y a un test s'exécute en premier
        while(age<18){
            System.out.println("inférieur -- while(condition)");
        }

        // la boucle va toujours s'exécuter une fois même si condition pas évaluée à true
        do{
            System.out.println("inférieur -- do{...}while(condition)");
        }while(age<18);

    }
}
