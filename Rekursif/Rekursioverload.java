class Rekursi_overload {
    static void main(String[] args) {
        System.out.println("Memulai rekursi tanpa base case:");
        Rekursi_Abadi(1);
    }

    public static void Rekursi_Abadi(int n) {
        System.out.println("Memanggil rekursi dengan nilai: " + n);
        Rekursi_Abadi(n + 1); // Tanpa base case, rekursi akan berjalan terus
    }
}