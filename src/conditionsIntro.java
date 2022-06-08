public class conditionsIntro {
    public static void main(String[] args) {

        //Declaration de la variable age
        byte age=17;

        //Test condition
        // si age >= 18 alors
        // afficher un message "vous êtes majeur et pouvez donc participer à la compétition"
        // fin si
        // Sinon
        // Afficher "vous êtes mineur et vous ne pouvez pas y participer"
        // Fni sinon
        if(age>=18) {
            System.out.println("Vous etes majeur donc vous pouvez participer");
        } else{
            System.out.println("Vous etes mineur donc vous ne pouvez pas y participer");
        }

        String pays="Espagne";
        if(pays=="France"){
            System.out.println("Bonjour");
        }else if(pays=="Allemagne"){
            System.out.println("Guten tag");
        }else if(pays=="Espagne"){
            System.out.println("Hola");
        }else if(pays=="Chine"){
            System.out.println("Ni hao");
        }else{
            System.out.println("le pays fourni n'est pas ");
        }
    }
}
