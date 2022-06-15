package approche_procedurale;

public class Tp24 {
    static boolean isPrefix(String word, String prefix) {
        for (int i = 0; i< prefix.length(); i++) {
            if (prefix.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
            return true;
    }


    public static void main(String[] args) {

        var word1="hugging";
        var prefix1="hug";

        System.out.println(isPrefix(word1,prefix1));

    }
}
