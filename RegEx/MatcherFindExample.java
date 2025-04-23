import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFindExample {
    public static void main(String[] args) {
        String text = "Saya suka kopi. Kopi itu nikmat. Kopi hitam adalah favorit saya.";

        Pattern p = Pattern.compile("kopi");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Pola ditemukan!");
        }
    }
}
