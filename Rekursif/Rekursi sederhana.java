class SumRecursion {
    public static void main(String[] args) {
        int n = 5; // Nilai yang ingin dijumlahkan
        System.out.println("Total penjumlahan dari 1 hingga " + n + " adalah: " + sum(n));
    }

    public static int sum(int n) {
        if (n == 1) return 1; // Base case: jika n = 1, langsung kembalikan 1
        return n + sum(n - 1); // Rekursi: n + hasil dari sum(n-1)
    }
}