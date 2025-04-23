public class Faktorial {
        public static void main(String[] args) {
            int n = 5;
            System.out.println("Faktorial dari " + n + " adalah: " + factorial(n));
        }

        public static int factorial(int n) {
            if (n == 1) return 1; // Base case
            return n * factorial(n - 1); // Recursive case
        }
    }

