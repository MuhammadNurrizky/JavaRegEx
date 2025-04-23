import java.util.Scanner;

public class SsnCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input SSN (123-12-1234): ");
        String ssn = input.nextLine();

        if (validSsn(ssn)) {
            System.out.println(ssn + " sesuai dengan pola regEx");
        } else {
            System.out.println("SSN ini tidak sesuai dengan pola regEx");
        }

        input.close();
    }

    static boolean validSsn(String ssn) {
        return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
    }
}
