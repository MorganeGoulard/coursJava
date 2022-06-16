package static_methode;

public class Validator {

    public static boolean isEmail(String email){
        return email.contains("@");
    }

    public static boolean minMax(String str, byte min, byte max){
        return str.length() >=min && str.length()<=max;
    }

}
