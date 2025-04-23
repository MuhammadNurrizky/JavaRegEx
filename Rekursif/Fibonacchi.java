public class Fibonacchi {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci ke-" + n + " adalah: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0; // Base case 1
        if (n == 1) return 1; // Base case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

}
