public class Exo4 {
    public static void main(String[] args) {

        int a=51, b=876, c=235;
        int aux;
        System.out.println("Les valeurs avant permutations sont a = "+a+" b = "+b+" c = "+c);

        aux=c;
        c=b;
        b=a;
        a=aux;

        System.out.println("Les valeurs après permutations sont a = "+a+" b = "+b+" c = "+c);

    }
}
