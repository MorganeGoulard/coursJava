import java.sql.SQLOutput;
import java.time.YearMonth;
import java.util.Calendar;

public class Exo5 {
    public static void main(String[] args) {

        byte age=27;
        // classe java.util.Calendar
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int yearOfBirth = currentYear-age;
        System.out.println("Votre année de naissance est : "+yearOfBirth);

        // classe java.time.YearMonth
        int year = YearMonth.now().getYear();
        int birthYear= year-age;
        System.out.println("Voter année de naissance est : "+birthYear);

    }
}
