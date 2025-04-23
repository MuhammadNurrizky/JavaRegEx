public class Fibonacchi2 {

        public static void main(String[] args) {
            int n = 6; // Nilai Fibonacci yang ingin dihitung
            System.out.println("Fibonacci ke-" + n + " adalah: " + fibonacci(n));
        }

        public static int fibonacci(int n) {
            System.out.println("Memanggil fibonacci(" + n + ")\n");
            if (n == 0) {
                System.out.println("Base case tercapai: fibonacci(0) = 0\n");
                return 0; // Base case
            }
            if (n == 1) {
                System.out.println("Base case tercapai: fibonacci(1) = 1\n");
                return 1; // Base case
            }
            // Rekursi
            int hasil = fibonacci(n - 1) + fibonacci(n - 2);
            System.out.println("Hasil fibonacci(" + n + ") = fibonacci(" + (n - 1) + ") + fibonacci(" + (n - 2) + ") = " + hasil);
            System.out.println("\n");
            return hasil;
        }

}
