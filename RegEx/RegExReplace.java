public class RegExReplace {
    public static void main(String[] args) {
        String str = "Wow!!! This is amazing!! Really!!!";
        str = str.replaceAll("!{2,}", "!");
        System.out.println(str);
    }
}


// Untuk Replacing with Regular Expressions Example