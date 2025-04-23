import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionsMatcher {
    public static void main(String[] args) {
        Pattern pola = Pattern.compile("(J|j)ava");

        String str = "Java courses are the best! You have got to love java.";

        System.out.println(str);

        Matcher m = pola.matcher(str);

        str = m.replaceAll("Oracle");

        System.out.println(str);
    }
}

// UNTUK CODINGAN REPLACING USING A MATCHER EXAMPLE
