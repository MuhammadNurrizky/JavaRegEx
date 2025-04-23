public class LoopFaktorial {
        public static void main(String[] args) {
            int n = 5;
            System.out.println("Faktorial dari " + n + " adalah: " + faktorialLoop(n));
        }

        public static int faktorialLoop(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i; // Hitung faktorial dengan iterasi
                System.out.println("Mengalikan: " + i + ", Total sementara: " + result);
            }
            return result;
        }

}
