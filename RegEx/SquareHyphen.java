public class SquareHyphen {
    public static void main(String[] args) {
        System.out.println(isRegex("2bcde")); // Akan bernilai True
        System.out.println(isRegex("abcde")); // Akan bernilai True
        System.out.println(isRegex("0Bcde")); // Akan bernilai False
    }


    public static boolean isRegex(String word) {
        return word.matches("[ 0-9a-zA-Z]bcde");
    }
}